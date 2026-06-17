package starProgram_practice;

public class Count_vowels {
    public static void main(String[] args) {
        String str= "Automation";
        int count=0;
        String lstr=str.toLowerCase();

        for(int i=0; i<lstr.length();i++){
            char ch =lstr.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch =='u')
            {
                count++;
            }

        }
        System.out.println(lstr);
        System.out.println(count);

        String rev="";
        for( int i=str.length()-1; i>=0; i--){
           rev =rev+ str.charAt(i);
        }
        System.out.println(rev);


    }

}
