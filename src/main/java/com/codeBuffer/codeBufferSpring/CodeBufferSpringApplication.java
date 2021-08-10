package com.codeBuffer.codeBufferSpring;

import com.codeBuffer.codeBufferSpring.entity.Department;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
//import java.util.logging.Logger;

@SpringBootApplication
public class CodeBufferSpringApplication{
	@Autowired
	Department department;
	//private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {

		/*ApplicationContext applicationContext =*/
		SpringApplication.run(CodeBufferSpringApplication.class, args);
		//System.out.println(depar);
		/*for (String name : applicationContext.getBeanDefinitionNames()) {
			if(name=="department"){
				System.out.println("yes");
			}
			System.out.println(name);
		}*/
	}


}

