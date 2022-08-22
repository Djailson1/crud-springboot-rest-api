package br.com.springboot.curso_jdev_treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication/*starta a aplicação web rodando spring boot*/
public class Application {
	
    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);/*é a linha principal que roda o projeto java Spring Boot*/
        
    }
}
