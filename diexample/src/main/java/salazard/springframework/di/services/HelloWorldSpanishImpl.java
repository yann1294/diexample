package salazard.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class HelloWorldSpanishImpl  implements HelloWorldService{

    @Override
    public String getGreetings() {
        return "Hola Mundo";
    }
}
