package constructor.ConstructorChaining;

class parent{
    parent(){
        System.out.println("Parent src.constructor");
    }
}

class child extends parent{
    child(){
        super();//first line of child class src.constructor is a no-argument src.constructor of parent class, by default provide by JVM
        System.out.println("Child src.constructor");
    }
}

public class parentchild extends child{
    public static void main(String[] args) {
        parentchild pc = new parentchild();
    }
}

