package salazard.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import salazard.springframework.di.services.HelloWorldFactory;
import salazard.springframework.di.services.HelloWorldService;
import salazard.springframework.di.services.HelloWorldServiceEnglishImpl;
import salazard.springframework.di.services.HelloWorldSpanishImpl;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }

    @Bean
    @Profile("german")
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
        return factory.createHelloWorldService("de");
    }
}
