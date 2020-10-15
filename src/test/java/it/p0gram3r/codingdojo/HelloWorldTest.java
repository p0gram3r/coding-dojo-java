package it.p0gram3r.codingdojo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloWorldTest {

    @Test
    public void test() {
        HelloWorld thingy = new HelloWorld();
        assertThat(thingy.getGreeting(), is("Hello World!"));
    }

}
