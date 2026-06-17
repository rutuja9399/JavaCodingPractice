package Practice;

public class ReverseString1 {
    public static void main(String[] args) {
        String name = "Omkar";
       int Left = 0;
       int right = name.length()-1;
        char[] arr = name.toCharArray();
      while(Left<right)
      {
          char temp = arr[Left];
          arr[Left] = arr[right];
          arr[right] = temp;

          Left++;
          right--;
      }
      String reverse = new String (arr);
      System.out.println(reverse);
    }
}
