package abstractStudy;

public class Mother extends Father {
    public static void main(String[] args) {
 Mother m1 = new Mother();
 m1.home();
m1.house();
 m1.study1();
 m1.study();
 Father.car();
 Mother.car1();
 Mother.car();
    }
    public void study1()
    {
        System.out.println("mothers study");
    }
    @Override
    public  void home(){
        System.out.println("fathers home y");
    }
    @Override
    public void house() {
        System.out.println("father house abstarct");
    }

    public static void car1()
    {
        System.out.println("mother car");
    }
}
