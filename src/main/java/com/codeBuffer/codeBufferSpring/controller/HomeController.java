package com.codeBuffer.codeBufferSpring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HomeController {
    public class Responseobj {

        private Long customerNumber;
        private String statusMessage;

        public Responseobj(Long id) {
            this.customerNumber = id;
            this.statusMessage = "Customer Created Successfully";
        }
    }

    // getters, setters, etc

    @RequestMapping(value ="/hello",method = RequestMethod.GET)
    public Responseobj helloWorld(){
        //System.out.println("HelloWorld");
        return new Responseobj(1L);
    }

}
