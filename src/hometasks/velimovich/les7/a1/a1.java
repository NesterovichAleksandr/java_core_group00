package hometasks.velimovich.les7.a1;

public class a1 {
    public static void main(String[] args) {
        class University {
            class Student {
                String name;
                String group;
                String faculty;

                class info {
                    public void name() {
                        System.out.println("The name is..." + name);
                    }

                    public void group() {
                        System.out.println("The group is..." + group);
                    }

                    public void faculty() {
                        System.out.println("The faculty is..." + faculty);
                    }
                }
            }
        }
    }
}
