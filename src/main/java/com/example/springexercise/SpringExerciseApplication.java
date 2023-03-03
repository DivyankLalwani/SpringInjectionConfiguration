package com.example.springexercise;

import com.example.springexercise.config.AnnotationConfig;
import com.example.springexercise.structure.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringExerciseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringExerciseApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Car car = context.getBean(Car.class);
		car.start();
	}
}
