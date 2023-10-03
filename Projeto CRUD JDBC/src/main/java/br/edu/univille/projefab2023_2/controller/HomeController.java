package br.edu.univille.projefab2023_2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    @ResponseBody
    public String index(){
        return "Sim, ele está funcionando 100%";
    }
}