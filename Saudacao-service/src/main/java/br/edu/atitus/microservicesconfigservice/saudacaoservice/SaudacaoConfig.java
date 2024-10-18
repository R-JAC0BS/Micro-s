package br.edu.atitus.microservicesconfigservice.saudacaoservice;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("saudacao-service")
public class SaudacaoConfig {

    private String saudacao;

    private String nomePadrao;

    public String getSaudacao() {
        return saudacao;
    }

    public void setSaudacao(String saudacao) {
        this.saudacao = saudacao;
    }

    public String getPadrao() {
        return nomePadrao;
    }

    public void setPadrao(String padrao) {
        this.nomePadrao = padrao;
    }
}
