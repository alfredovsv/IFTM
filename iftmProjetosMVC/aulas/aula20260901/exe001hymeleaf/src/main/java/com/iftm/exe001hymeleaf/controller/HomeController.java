package com.iftm.exe001hymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {

    @GetMapping("/")
    public String olaMundo(Model model){
        model.addAttribute("mensagem","ola mundo vindo do spring, tenho que atualiar o servidor toda vez, mesmo editando o html");
        return "index";
    }
    

    @GetMapping("/formulario")
    public String formulario(Model model){

        //lista para radio buttom
        List<String> listaPlanos = Arrays.asList("Gratuito", "Mensal", "Anual");
        model.addAttribute("opcoesPlanos",listaPlanos);

        //lista para checkbox
        // Lista completa de opções do checkbox
        List<String> listaTecnologias = Arrays.asList("Java", "Spring Boot", "Thymeleaf", "JavaScript", "Docker");
        model.addAttribute("listaTecnologias", listaTecnologias);

        return "formulario";
    }
}
