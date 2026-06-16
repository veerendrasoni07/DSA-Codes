package comparator;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s) {
        if(this.rno  == s.rno){
            return Double.compare(s.cgpa,this.cgpa);
        }
        return Integer.compare(this.rno,s.rno);
    }
}
public class comparator {
    public static void main(String[] args) {
        Student s1 = new Student("Joy",24,9.3);
        Student s2 = new Student("Jovel",8,4.5);
        Student s3 = new Student("Raghav",8,6.9);
        Student s4 = new Student("Adi",20,9.6);
        Student s5 = new Student("Jodu",41,5.6);
        Student [] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.println(s.name + " " + s.rno + " " + s.cgpa);
        }
    }
}
