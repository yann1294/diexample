package salazard.springframework.di.services;

public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Привет мир";
    }
}
