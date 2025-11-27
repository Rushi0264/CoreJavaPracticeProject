package SerializationAndDeSerialization;

import java.io.*;

public class DeSerializationDemo {
    public static void main(String[] args) {
        String filename = "C:\\AutomationTest\\TestFile.txt";

        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            StudentSerialization obj = (StudentSerialization)ois.readObject();
            System.out.println(obj.stdRoll);
            System.out.println(obj.stdName);

            ois.close();
            fis.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
