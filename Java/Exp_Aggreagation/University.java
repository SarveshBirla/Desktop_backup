package Exp_Aggreagation;

import java.util.ArrayList;
import java.util.Scanner;

 class Student{
     String name;
    int uid;

    Student(String name,int uid){
        this.name=name;
        this.uid=uid;
    }
    
}
public class University {

    public static void main(String[] args) {
    ArrayList<Student> s=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of Students");
    int n=sc.nextInt();

    for(int j=0;j<n;j++){
        System.out.println("Enter the name of "+ j +" Student");
        String name=sc.next();
        System.out.println("Enter the uid of "+ j +" Student");
        int uid =sc.nextInt();
        Student student=new Student(name,uid);
        s.add(student);
    }
    for(int j=0;j<n;j++){
        System.out.println("Name of "+ j +" Student :"+ s[j].name);
      
        System.out.println("Uid of "+ j +" Student" + s[j].uid);
       
      
       
    }
    
     
    }
    
}
