//COPY CONSTRUCTOR
public class Note_four {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name = "Shubham";
        s1.roll_num = 27;
        s1.password = 2705;

        Student s2 = new Student(s1);
        s2.password = 12312;

    System.out.println(s2.name + " " + s2.roll_num + " " + s2.password);    
    }
}

class Student{
    String name;
    int roll_num;
    int password;

    Student(){}//No - argument constructor

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll_num = s1.roll_num;
        this.password = s1.password;
    }

    Student(String name){
        this.name = name;
    }
}