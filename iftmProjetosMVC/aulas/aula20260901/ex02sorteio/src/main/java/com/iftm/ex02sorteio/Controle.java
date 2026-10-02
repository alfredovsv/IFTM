package com.iftm.ex02sorteio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class Controle{

    @GetMapping("")
    public String exibeSorteio(Model modelo){
        List<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <=6; i++){
            numeros.add((int) (Math.random()* 60 + 1));
        }
        

        modelo.addAttribute("numeros",numeros);
        return "index";
    }
}