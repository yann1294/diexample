package salazard.springframework.di.services;

public class HelloWorldServicePolishImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Witaj świecie";
    }
}
