package Exception;

public class ReturnStatement {
    public int show(){
        try {
            System.out.println("try block");

            return 1;
        }catch (Exception e){
            return 2;
        }
        finally {
            return 4;
        }
    }

    public static void main(String[] args) {
        ReturnStatement obj = new ReturnStatement();
        System.out.println( obj.show());
    }
}
