package abstractStudy;

public abstract class Father {
    //in abstract class we need one incomplete method atleast
    //we cannot create object of abstarct class
    public static void main(String[] args) {

    }
    public void study(){
        System.out.println("father asked for study");
    }
    public abstract void home();
public abstract void house();
    public static void car()
    {
        System.out.println("fathers car");
    }
}
