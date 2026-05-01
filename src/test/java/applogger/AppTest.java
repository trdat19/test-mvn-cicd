package applogger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @BeforeAll
    public static void runBeforeAllTest() {
        System.out.println("Test App");
    }

    @Test
    public void testAdd() {
        assertEquals(15, App.add(5,10));
    }
}