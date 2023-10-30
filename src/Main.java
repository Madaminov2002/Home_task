import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> list=new ArrayList<>();
        BufferedReader bfr=new BufferedReader(new FileReader("exam/recourse.text"));
        String next;
        while ((next=bfr.readLine()) != null){
            list.add(next);
        }
       // list.forEach(System.out::println);
        bfr.close();

        List<Student> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] arr=list.get(i).split(",");
            list1.add(new Student(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6]),
                    Integer.parseInt(arr[7])));
        }


        BufferedWriter bwr=new BufferedWriter(new FileWriter("exam/exam1.text"));
        for (int i = 0; i < list1.size(); i++) {
            bwr.write(list1.get(i).writeInfo(list1.get(i)));

        }
        bwr.close();


    }
}