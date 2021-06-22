package exam;
import.util.Scanner;
public class ConvertToBinary {

  public StringtoBinary(final int n) {
    String bin = ""
      try{
        if(n<0);
      }
    catch(Exception e)
    {
      System.out.println(e);
    }
    while(n > 0)
    {
        int a = n%2 ;
        bin = a + bin;
        n = n/2;
    }
    return bin;
  }
  public static void main(String[] args){
      int no;
      Scanner s=new Scanner(System.in);
      n = s.nextInt();
      System.out.println(StringtoBinary(no));
  }
}
