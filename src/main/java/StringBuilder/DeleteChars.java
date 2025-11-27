package StringBuilder;

public class DeleteChars {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Programming");
        sb.delete(3,8);
        System.out.println(sb);
    }
}
