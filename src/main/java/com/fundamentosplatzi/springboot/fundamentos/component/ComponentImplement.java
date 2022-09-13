package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class ComponentImplement implements ComponentDependency{
	@Override
	public void saludar() {
		System.out.println("hola desde primer componenete");
	}

}
