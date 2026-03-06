package br.com.senac.imc.controllers;

import br.com.senac.imc.dtos.CalculadoraImcDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/imc")
@CrossOrigin
public class CalculadoraImc {

    @GetMapping("/calcular")
    public ResponseEntity<CalculadoraImcDTO> calcular
            (@RequestParam double peso,
            @RequestParam double altura){

        CalculadoraImcDTO imc = new CalculadoraImcDTO();
        imc.setImc(peso /(altura *altura));

        if (imc.getImc() <= 18.5){
            imc.setClassificacao("abaixo do peso");
        }
        else if (imc.getImc() <=24.9 ){
            imc.setClassificacao("peso normal");
        }
       else if (imc.getImc()<=29.9){
            imc.setClassificacao("sobrepeso");
        }
        else if (imc.getImc()<=34.9){
            imc.setClassificacao("Obesidade Grau 1");
        }
        else if(imc.getImc()<=39.9){
            imc.setClassificacao("Obesidade Grau 2 ");
        }
        else if(imc.getImc()>=40){
            imc.setClassificacao("Obesidade Grau 3 (Morbida)");
        }

        return ResponseEntity.ok(imc);
    }

}
