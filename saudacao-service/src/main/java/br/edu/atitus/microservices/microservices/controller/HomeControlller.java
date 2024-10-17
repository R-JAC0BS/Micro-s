package br.edu.atitus.microservices.microservices.controller;


import br.edu.atitus.microservices.microservices.SaudacaoConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeControlller {


    private final SaudacaoConfig saudacaoConfig;

    public HomeControlller(SaudacaoConfig saudacaoConfig) {
        super();
        this.saudacaoConfig = saudacaoConfig;
    }

    @GetMapping ({"","/", "/{name}"})
    public ResponseEntity<String> home(
            @RequestParam (required = false) String nome,
            @PathVariable(required = false) String name
    ) {
        if (nome==null) nome = name == null ? saudacaoConfig.getPadrao() : name;
        String template = "%s %s!";
        return ResponseEntity.ok(String.format(template, saudacaoConfig.getSaudacao(),nome));

    }



}
