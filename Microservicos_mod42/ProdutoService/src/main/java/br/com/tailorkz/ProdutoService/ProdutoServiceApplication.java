package br.com.tailorkz.ProdutoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.tailorkz.ProdutoService", "Controller", "Repository"})
@EnableJpaRepositories(basePackages = {"Repository"})
public class ProdutoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdutoServiceApplication.class, args);
    }

}