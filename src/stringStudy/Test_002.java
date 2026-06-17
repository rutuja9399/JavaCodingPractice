package stringStudy;

public class Test_002 {


    public static void main(String[] args) {
        String a1= "Velocity";
        //length...
        int val = a1.length();
        System.out.println("length of velocity: "+val);

        //touppercase
        String val1 = a1.toUpperCase();
        System.out.println("uppercase: "+val1);

        //Tolowercase
        String val2 = val1.toLowerCase();
        System.out.println("Tolopwercase: "+val2);

        //equals
        String b1= "KiteFLying";
        String b2 ="KiteFLying";
        String b3 ="KITEFLYING";
        boolean IsCorrect = b1.equals(b2);
        boolean IsCorrect1= b2.equals(b3);
        boolean comapre_3 = b1.equals(b2.equals(b3));

        System.out.println(IsCorrect);
        System.out.println(IsCorrect1);
        System.out.println("compare 3 string: "+comapre_3);

        //IgnoreCase
        boolean str = b1.equalsIgnoreCase(b2);
        System.out.println("Ignorecse :"+str);

        System.out.println("*********************");
        //Contains
        String ch ="Maharashtra";
        boolean c1 = ch.contains("tr");
        System.out.println("CHechikng tr is in string: "+c1);
        boolean c2 =ch.contains("aa");
        System.out.println("Checking aa in string:"+ c2);
        boolean c3 = ch.contains("Maharashtra");
        System.out.println("CHechikng whole string: "+c3);
//String c4 = null;
//        System.out.println(c4.length());

        System.out.println("*********************");

        //IsEmpty
        //Isblank
        String d1= "null";
        boolean v = d1.isEmpty();
        System.out.println("IsEMpty: "+v);
        String d2= "";
boolean v1 = d2.isBlank();
        System.out.println("IsBlank: "+v1);
//charAt
        String e= "Kanchan";
      char CC = e.charAt(3);
      System.out.println("charAt 3 is ::"+CC);

      //IndexOutOfBound

//        char CC1 = e.charAt(90);
//        System.out.println("charAt 90 is ::"+CC1);

        //Startwith and ends with

        String name = "Kanchan";
        boolean ww = name.startsWith("Kn");
        boolean ww2 = name.endsWith("aa");
        System.out.println("Start with: "+ww);
        System.out.println("ends with :"+ww2);

        //substring

        String description = "hi there I am rutuja shinde. Manual Tester";
        String vv = description.substring(5);
        String vv1 =description.substring(14,20);
        System.out.println(vv);
        System.out.println(vv1);

// concat

        String school = "kilbil";
        String school2 = "Vidya";
school.concat(school2); //kilbilVidya

        String strr= school.concat(" ").concat(school2);
        System.out.println(strr);
        String str2= school.concat(" Yash");




    }}