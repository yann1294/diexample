package salazard.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import salazard.springframework.di.services.HelloWorldService;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){

        String greeting = helloWorldService.getGreetings();

        System.out.println(greeting);

        return greeting;
    }
}
