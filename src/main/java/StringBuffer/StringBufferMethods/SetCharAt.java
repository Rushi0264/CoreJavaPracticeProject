package StringBuffer.StringBufferMethods;

public class SetCharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.setCharAt(0,'Y');
        System.out.println(sb);
    }
}
