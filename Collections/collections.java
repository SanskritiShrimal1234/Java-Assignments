import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;





public class Main {
    public static void main(String[] args) {

      // Linkedlist

        LinkedList list2 = new LinkedList();

        list2.add("1");
        list2.add(2);
        list2.add(3);
        list2.add("hello world");
        list2.add(5);

        list2.remove(2);

        System.out.println(list2);
      
      
      
        // Arraylist
        ArrayList list = new ArrayList<>();

        list.add("1");
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add("hello world");

        list.remove(2);
        list.add(1,7);

        System.out.println(list);
        

        //custom student class arraylist
        ArrayList <Student> stu_list = new ArrayList<Student>();


        Student s1 = new Student(101, "Sans" , 100);
        Student s2 = new Student(102, "sanskriti", 39);
        Student s3 = new Student(103, "Sanskritishrimal", 92);

        stu_list.add(s1);
        stu_list.add(s2);
        stu_list.add(s3);

        stu_list.remove(1);

        for(Student s : stu_list)
        {
            System.out.println(s.getAll());
        }

    }

}
