package methodStudy;

public class MethodWithPara2 {
    public void a1(int c){
        int a = 4;
        int b= 6;
        c = a+b;
        System.out.println("Addition of A&B :"+c);
    }

    public void a1(int a,int b,int c, int d)
    {
        d = a+b+c;
        System.out.println(d);
    }
 public void a1(String name, int id, boolean result, char grade, float marks, double percentage){
        System.out.println("Name of student is: "+name);
     System.out.println("Id of student: "+id);
     System.out.println("Result of student: "+ result);
     System.out.println("Grade of student : "+grade);
     System.out.println("Marks of student: "+marks);
     System.out.println("Percentage of student is:"+ percentage);

 }
 public void a1()
 {
     String name= "Yash";
     int id = 55;
     boolean result= true;
     char grade= 'A';
     float marks= 87.88f;
     double percentage =87.9876d;
     System.out.println("Name of student is: "+name);
     System.out.println("Id of student: "+id);
     System.out.println("Result of student: "+ result);
     System.out.println("Grade of student : "+grade);
     System.out.println("Marks of student: "+marks);
     System.out.println("Percentage of student is:"+ percentage);
 }
    public static void main(String[] args) {
MethodWithPara2 para = new MethodWithPara2();
System.out.println("****************************");
para.a1();
System.out.println("****************************");
para.a1(4);
System.out.println("****************************");
para.a1(3,4,5,6);
System.out.println("****************************");
para.a1("vaishu", 5, false,'B', 65.6f, 45.6987d);
System.out.println("****************************");


    }
}
