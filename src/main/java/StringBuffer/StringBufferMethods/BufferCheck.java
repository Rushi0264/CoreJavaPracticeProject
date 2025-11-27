package StringBuffer.StringBufferMethods;

public class BufferCheck {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(0,"Start ");
        sb.reverse();
        System.out.println(sb);
    }
}
