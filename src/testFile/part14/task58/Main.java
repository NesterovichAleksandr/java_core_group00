package testFile.part14.task58;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Producer().start();
        }
        for (int i = 0; i < 2; i++) {
            new Consumer().start();
        }

    }
}
