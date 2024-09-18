package by.onliner.baranodenis;

public class Waiters {
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(4);
        } catch (Exception e) {
                throw new RuntimeException(e);
        }
    }
}
