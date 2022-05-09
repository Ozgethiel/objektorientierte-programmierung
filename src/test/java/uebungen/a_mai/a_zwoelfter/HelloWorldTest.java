package uebungen.a_mai.a_zwoelfter;

import org.junit.jupiter.api.Test;
import uebungen.a_mai.SystemOutMockingTest;

class HelloWorldTest extends SystemOutMockingTest {
    @Test
    void main() {
        HelloWorld.main(null);

        assertSystemOutEquals("Hello world!");
    }
}