package dataTypes;

public class StudentData {
    public static void main(String[] args) {
        //(student_name, age, roll_no, Div, marks)

        //variable declaration
        String student_name ;
        int roll_no;
        float age;
        char div;
        double marks;
        boolean attendance;

        /* assign value */
        student_name = "yashraj";
        roll_no = 18;
        age = 12.2f;
        div = 'A';
        marks = 49.846d;

       // printing student data in console
        System.out.println("*****OUTPUT*****");
        System.out.println("Name of student:"+ student_name);
        System.out.println("Roll number of student:"+ roll_no);
        System.out.println("Age of student:"+ age);
        System.out.println("Division of student is:"+ div);
        System.out.println("Marks of student:"+ marks);

    }

}
