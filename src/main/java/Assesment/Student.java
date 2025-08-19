package Assesment;
class students {
    String name;
    int roll ;
    double marks;
    students(String name, int roll, int marks){
        this.roll=roll;
        this.marks=marks;
        this.name=name;
    }
    public void studentDetails()
    {
        System.out.println("Student Name="+name);
        System.out.println("Student Roll Number="+roll);
        System.out.println("Student Marks="+marks);
    }
}
public class Student{
    public static <Students> void main(String[] args) {
        students s=new students("vishnu",101,100);
        students s1=new students ("priya",102,100);
        s.studentDetails();
        s1.studentDetails();
    }
}


