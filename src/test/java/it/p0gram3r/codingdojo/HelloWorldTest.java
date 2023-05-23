package it.p0gram3r.codingdojo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void test() {
        HelloWorld thingy = new HelloWorld();
        assertThat(thingy.getGreeting()).isEqualTo("Hello World!");
    }

}
