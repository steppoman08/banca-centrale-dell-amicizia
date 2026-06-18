package org.bca.bcabe;

import org.bca.bcabe.configuration.ApplicationContext;
import org.bca.bcabe.entity.Amico;
import org.bca.bcabe.service.AmicoService;
import org.bca.bcabe.service.impl.AmicoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class BcaBeApplication {

    public static void main(String[] args) {
        System.out.println("Istanzio il context");
        var context = SpringApplication.run(BcaBeApplication.class, args);
        System.out.println("Context istanziato");
        System.out.println("Istanzio AmicoServiceImpl (bean)");
        AmicoService amicoService = context.getBean(AmicoService.class);
        List<Amico> amici = amicoService.findAll();
        for(Amico amico : amici) {
            System.out.println(amico.getIdAmico());
            System.out.println(amico.getNome());
            System.out.println(amico.getCognome());
            System.out.println(amico.getSoprannome());
            System.out.println("--------------------------");
        }
    }

}
