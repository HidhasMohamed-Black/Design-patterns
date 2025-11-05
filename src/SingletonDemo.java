import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Logger Class
class Logger {
    // private static instance of Logger
    private static Logger instance;

    // private constructor
    private Logger() {
        System.out.println("Logger initialized...");
    }

    // public static method
    public static Logger getInstance() {
        // Create instance only if it doesn't exist - lazy initialization
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // log method that prints a timestamped message
    public void log(String message) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + message);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // Get two logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both references
        logger1.log("Application started.");
        logger2.log("Processing user request...");

        // Verify both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist (not a singleton).");
        }
    }
}
