package com.jachi.ejercicios.session6;

import com.jachi.ejercicios.session6.models.Laptop;
import com.jachi.ejercicios.session6.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Session6Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Session6Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);
		Laptop laptop= new Laptop(null,"Toshiba","Z-400",16,3500D);
		repository.save(laptop);
	}

}
