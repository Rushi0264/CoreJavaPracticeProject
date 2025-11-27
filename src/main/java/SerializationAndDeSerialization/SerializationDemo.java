package SerializationAndDeSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        StudentSerialization obj = new StudentSerialization();
        obj.stdRoll=5;
        obj.stdName="Rushi";

        String fileName = "C:\\AutomationTest\\TestFile.txt";

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);

            oos.close();
            fos.close();

            System.out.println("Object saved in file");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
