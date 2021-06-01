package inter.bootcamp.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {

    public String sayHi() {
        return this.sayHi("World");
    }

    public String sayHi(String name) {
        return "Hello " + Objects.requireNonNullElse(name, "World");
    }
}
