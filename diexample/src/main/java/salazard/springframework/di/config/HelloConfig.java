package salazard.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import salazard.springframework.di.services.HelloWorldService;
import salazard.springframework.di.services.HelloWorldServiceEnglishImpl;
import salazard.springframework.di.services.HelloWorldSpanishImpl;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldSpanishImpl();
    }
}
