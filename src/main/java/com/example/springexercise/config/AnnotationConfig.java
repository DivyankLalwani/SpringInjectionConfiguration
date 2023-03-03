package com.example.springexercise.config;

import com.example.springexercise.structure.Car;
import com.example.springexercise.structure.CombustionEngine;
import com.example.springexercise.structure.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean
    public Engine engine(){
        System.out.println("Bean of Combustion engine is created");
        return new CombustionEngine();
    }
    @Bean
    public Car car(Engine engine){
        System.out.println("Bean of Car is Created ");
        return new Car(engine);
    }
}
