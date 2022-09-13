package com.fundamentosplatzi.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;


@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{

	@Autowired
	private ComponentDependency componentDependency;
	
	// public FundamentosApplication(ComponentDependency componentDependency) {
	// 	this.componentDependency = componentDependency;
	// }
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
	}

}
