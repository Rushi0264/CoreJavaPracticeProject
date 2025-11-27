package StringBuilder;

public class BuilderCheck {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb.insert(0,"Start ");
        sb.reverse();
        System.out.println(sb);
    }
}
