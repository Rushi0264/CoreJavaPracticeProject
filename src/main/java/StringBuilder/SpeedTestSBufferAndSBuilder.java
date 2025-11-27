package StringBuilder;

public class SpeedTestSBufferAndSBuilder {
    public static void main(String[] args) {

        //StringBuffer
        long start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i=0; i<100000; i++){
            sbf.append("A");
        }
        long end = System.currentTimeMillis();
        System.out.println("String Buffer Time : "+(end-start));


        //StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder();
        for (int i=0; i<100000; i++){
            sbl.append("B");
        }
        end = System.currentTimeMillis();
        System.out.println("String Builder Time : "+(end-start));
    }
}
