
public class SingletonTest {
	public static void main(String args[]) {
		//two references to Logger
		Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use them
        logger1.log("First message");
        logger2.log("Second message");

        // Prove both are the same instance
        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both are the same Logger instance.");
        } else {
            System.out.println("FAILED: Different instances were created.");
        }
	}
}
