package StringBuilder;

public class InsertText {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Programming");
        sb.insert(0,"Java ");
        System.out.println(sb);
    }
}
