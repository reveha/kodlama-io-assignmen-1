package com.languages.ProgramminLanguages;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
public class ProgramminLanguagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramminLanguagesApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper(){
		return new ModelMapper();
	}

}
