package hometasks.velimovich.les5.les5_2.a4;

public class a4 {
    public abstract class Var{
public abstract void something();
    }
public class Scalar extends Var{
    @Override
    public void something() {
    }
}
public class Vector extends Var {
    @Override
    public void something() {
    }
    public class Matrix extends Var {
        public void something(){}
    }
}
}
