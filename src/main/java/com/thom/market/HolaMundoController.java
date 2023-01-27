package com.thom.market;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    //creamos el metodo saludar



    @GetMapping("/hola")
    public String saludar(){
        return "Nunca pares de aprender ";
    }


}
