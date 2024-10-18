package br.edu.atitus.microservicesconfigservice.saudacaoservice;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class Controller {

    private final SaudacaoConfig saudacaoConfig;

    public Controller(SaudacaoConfig saudacaoConfig) {
        this.saudacaoConfig = saudacaoConfig;
    }

    @GetMapping({"","/", "/{name}"})
    public ResponseEntity<String> home(
            @RequestParam(required = false) String nome,
            @PathVariable(required = false) String name
    ) {
        if (nome==null) nome = name == null ? saudacaoConfig.getPadrao() : name;
        String template = "%s %s!";
        return ResponseEntity.ok(String.format(template, saudacaoConfig.getSaudacao(),nome));

    }
}
