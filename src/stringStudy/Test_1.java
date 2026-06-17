package stringStudy;

public class Test_1 {
    public static void main(String[] args) {
        //length of string
        String name = "Rutuja";
         System.out.println(" String size: "+ name.length());
         //here we are not storing length of string
        int size = name.length();
        System.out.println("Size of string name:"+ size);
        //here we strore the string size in int

        //to uppercase and to lowercase
        String school = "MarathaWada";
        //touppercase
        String school_upper= school.toUpperCase();
        System.out.println("Schoolname in uppercase:"+ school);

        //tolowercase
        String school_lowercase= school.toLowerCase();
        System.out.println("SChoolname in lowercase: "+ school_lowercase);

        //equals
        String boy ="yash";
        String boy2 ="yash";
        String boy3 ="YASH";
        boolean value= boy.equals(boy2);
        System.out.println(value);
        boolean value2 = boy.equals(boy3);
        System.out.println(value2);

        //ignore case sensitivity in checking equality between two string
//here case sensitivity ignore so it i sgiving output as true+
        boolean value3 = boy.equalsIgnoreCase(boy3);
        System.out.println(value3);

//replace

        String aa ="yash";
        String bb="saket";
        System.out.println(aa.replace('y','a'));
        System.out.println(bb.replace("sa","san"));
        System.out.println(bb.replaceAll("saket","rahu"));

        //indexOf
        String cc = "yashraj abhishek patil";
        System.out.println(cc.indexOf('h'));
        System.out.println(cc.indexOf("pat"));
        System.out.println(cc.indexOf('a',6));
        System.out.println(cc.indexOf("shek",7,18));
        System.out.println(cc.lastIndexOf('j'));
        System.out.println(cc.lastIndexOf("hi"));
        System.out.println(cc.lastIndexOf('a',19));
        System.out.println(cc.lastIndexOf("hhh",18));

    }
}
