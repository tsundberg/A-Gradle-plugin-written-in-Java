package se.thinkcode;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HelloWorldTest {
    @Test
    public void greet_the_user() {
        String greeting = "Hello World!";
        HelloWorld helloWorld = new HelloWorld(greeting);

        String actualGreeting = helloWorld.greet();

        assertThat(actualGreeting, is(greeting));
    }
}
