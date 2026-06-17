package methodStudy;

public class Non_Static_Method {
    public static void main(String[] args) {
        //calling static & non-static method in the another class
        //To call static method in the another class, need to just class by classname.methodname

        Static_Method.run();

        //To call the non-static method in another class
        //need to make object of class & then call it by objectname.methodname
        //ClassName ObjectName = new ClassName();
        Static_Method obj = new Static_Method();
        obj.fun();
    }
}
