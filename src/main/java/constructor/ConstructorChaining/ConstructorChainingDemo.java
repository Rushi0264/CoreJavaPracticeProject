package constructor.ConstructorChaining;

class Parent{
    Parent(){
        System.out.println("Parent no args src.constructor");
    }
    Parent(int a){
        this();
        System.out.println("Parent args src.constructor");
    }
}
class Child extends Parent{
    Child(){
        this(1);
        System.out.println("Child no args src.constructor");
    }

    Child(int a){
        super(5);
        System.out.println("Child args src.constructor");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        System.out.println("Creating child object no args src.constructor");
        Child c = new Child();

        System.out.println();

        System.out.println("Creating child object args src.constructor");
        Child c1 = new Child(5);
    }
}
