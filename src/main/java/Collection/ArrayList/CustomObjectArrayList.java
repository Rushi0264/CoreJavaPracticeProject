package Collection.ArrayList;


import java.util.ArrayList;

class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public String toString(){
        return "Roll_no -> "+rollNo+", Name -> "+name;
    }
}

public class CustomObjectArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(11,"Rushi"));
        students.add(new Student(12,"Omkar"));
        students.add(new Student(13,"Shubham"));
        students.add(new Student(14,"Ganesh"));

        for (Student s : students){
            System.out.println(s);
        }
    }
}
