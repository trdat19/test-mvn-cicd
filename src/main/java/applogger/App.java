package applogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Starting Application...");
        int result = add(5, 10);
        logger.info("Result is: {}", result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int dup(int x, int y) {
        return x * y;
    }

    public static int plus5(int x) {
        return x + 5;
    }
}

