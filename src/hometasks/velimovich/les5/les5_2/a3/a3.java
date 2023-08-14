package hometasks.velimovich.les5.les5_2.a3;

public class a3 {
    public static class Animal{
       void voice() {

        }
    }
    static class Dog extends Animal {
    }
    static class Cat extends Animal {
    }
    static class Husky extends Dog {
        @Override
        public void voice(){
        super.voice();
            System.out.println("I am husky!");
        }
    }
    static class Cheshire extends Cat {
        public void voice(){
            super.voice();
            System.out.println("I am cheshire!");

        }
    }
}
