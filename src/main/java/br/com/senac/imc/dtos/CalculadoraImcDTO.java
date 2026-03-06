package br.com.senac.imc.dtos;

public class CalculadoraImcDTO {

    private double imc;
    private String classificacao;

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }


}
