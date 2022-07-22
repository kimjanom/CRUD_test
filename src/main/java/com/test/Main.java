package com.test;

import com.test.dto.Member;
import com.test.dto.Team;
import com.test.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootApplication
//@EnableJpaRepositories

@EnableJpaAuditing
//@Configuration
//aop관련 설정
//@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "com.test")
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
@Component
class Runner implements CommandLineRunner{
    @Autowired
    CRUDService service;
    @Override
    public void run(String... args) throws Exception {

        service.save();
    }
}
