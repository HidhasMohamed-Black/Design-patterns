import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Thread-safe lazy Singleton Logger
class LoggerThreadSafe {
    private static LoggerThreadSafe instance;

    private LoggerThreadSafe() {
        System.out.println("Logger initialized...");
    }

    // Thread-safe access
    public static synchronized LoggerThreadSafe getInstance() {
        if (instance == null) {
            instance = new LoggerThreadSafe();
        }
        return instance;
    }

    public void log(String message) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + message);
    }
}

public class ThreadSafeSingletonDemo {
    public static void main(String[] args) {
        LoggerThreadSafe logger1 = LoggerThreadSafe.getInstance();
        LoggerThreadSafe logger2 = LoggerThreadSafe.getInstance();

        logger1.log("Thread-safe Singleton started.");
        logger2.log("Logging from second reference.");

        if (logger1 == logger2) {
            System.out.println("Both references are the same instance (thread-safe).");
        }
    }
}
