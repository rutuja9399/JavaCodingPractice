package methodStudy;

public class Method_1 {
        public void Fun()// regular method
        {
        }
        public static void run()//regular static method
        {
        }

        public static void main(String[] args) {
                //to call the static method from the another class we need to call it by
                //Class_name.Method_name();
                Method_2.a();

                Method_2.b();

                //to call the non static method in the another call we need to call by object creation
                //TO create object
                //classname object = new classname();
                Method_2 obj = new Method_2();
                obj.p();
                obj.q();

        }
}
