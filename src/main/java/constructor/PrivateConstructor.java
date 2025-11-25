package constructor;

public class PrivateConstructor {
    private PrivateConstructor(){
        System.out.println("This is private src.constructor");
    }

    public static void main(String[] args) {
        PrivateConstructor p = new PrivateConstructor();
    }
}
