package org.bca.bcabe.controller.impl;

import org.bca.bcabe.controller.AmicoController;
import org.bca.bcabe.entity.Amico;
import org.bca.bcabe.service.AmicoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AmicoControllerImpl {

    private final AmicoService amicoService;

    public AmicoControllerImpl(AmicoService amicoService) {
        this.amicoService = amicoService;
    }

    @GetMapping("/api/amici")
    @ResponseBody
    public List<Amico> findAllAmici() {
        List<Amico> listaAmici = amicoService.findAll();
        System.out.println("Amici da Controller");
        for(Amico amico : listaAmici) {
            System.out.println("---------------");
            System.out.println(amico.getNome());
            System.out.println("---------------");
        }
        return listaAmici;
    }

}
