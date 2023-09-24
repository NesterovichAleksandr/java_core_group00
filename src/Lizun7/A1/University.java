package Lizun7.A1;

public class University {

    private final String surname = "Ivanov";
    private final String name = "Ivan";
    private final int numberGroup = 51;
    private final double averageScore = 8.9;


    public class Student {
        private final boolean freeEducation = true;

        public void aboutStudent() {
            System.out.println("Фамилия " + surname + "; Имя " + name + "; \n" +
                    "Номер группы " + numberGroup + "; Средний балл " + averageScore);
        }

        public void freeEducation() {
            System.out.println("Образование бесплатное - " + freeEducation);
        }
    }
        public static void main(String[] args) {
            University.Student student = new University().new Student();
            student.aboutStudent();
            student.freeEducation();
        }
    }


