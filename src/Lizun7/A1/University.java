package Lizun7.A1;

public class University {
    private String surname;
    private String name;
    private int numberGroup;
    private short averageScore;


    public class Student {
        private boolean freeEducation = true;

        public void aboutStudent() {
            System.out.println("Фамилия " + surname + "; Имя " + name + "; " +
                    "Номер группы " + numberGroup + "; Средний балл" + averageScore);
        }

        public boolean freeEducation() {
            return freeEducation;
        }

        public static void main(String[] args) {
            University.Student student = new University().new Student();
            student.aboutStudent();
            student.freeEducation();
        }
    }

}
