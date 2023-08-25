package hometasks.velimovich.les7.a2;

public class a2 {
    public static void main(String[] args) {
        class Parrot {
            public void say() {
                System.out.println("Parrot can't say");
            }

            Parrot parrot2 = new Parrot() {
                @Override
                public void say() {
                    System.out.println("Parrot can say");
                }
            };
        }
    }
}
