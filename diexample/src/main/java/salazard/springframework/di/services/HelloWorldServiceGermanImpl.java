package salazard.springframework.di.services;


public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Hallo Welt";
    }
}
