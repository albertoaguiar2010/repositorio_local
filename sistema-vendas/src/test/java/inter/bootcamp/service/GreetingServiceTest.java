package inter.bootcamp.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingServiceTest {
    @Test
    void shouldReturnHelloWorld() {
        GreetingService greetingService = new GreetingService();

        assertThat(greetingService.sayHi())
                .isNotEmpty()
                .isEqualTo("Hello World");
    }

    @Test
    void shouldReturnHelloWorldWhenProvideNull() {
        GreetingService greetingService = new GreetingService();

        assertThat(greetingService.sayHi(null))
                .isNotEmpty()
                .isEqualTo("Hello World");
    }

    @Test
    void shouldReturnHelloMichael() {
        GreetingService greetingService = new GreetingService();

        assertThat(greetingService.sayHi("Michael"))
                .isNotEmpty()
                .isEqualTo("Hello Michael");
    }
}