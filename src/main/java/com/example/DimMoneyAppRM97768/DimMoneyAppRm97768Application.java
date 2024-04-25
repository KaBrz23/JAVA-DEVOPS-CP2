package com.example.DimMoneyAppRM97768;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class DimMoneyAppRm97768Application {

	public static void main(String[] args) {
		SpringApplication.run(DimMoneyAppRm97768Application.class, args);
	}

	@RequestMapping
	@ResponseBody
	public String home(){
		return "Deploy efetuado com sucesso no Servidor Tomcat 10. Bom trabalho!";
	}

}
