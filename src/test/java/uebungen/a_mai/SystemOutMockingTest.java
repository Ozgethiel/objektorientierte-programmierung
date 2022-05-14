package uebungen.a_mai;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class SystemOutMockingTest {
    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    protected void assertSystemOutEquals(String expected) {
        String outString = outContent.toString();
        originalOut.println(outString);
        assertThat(outString.substring(0, outString.length() > System.lineSeparator().length() ? outString.length() - System.lineSeparator().length() : 0)).isEqualTo(expected);
    }
}
