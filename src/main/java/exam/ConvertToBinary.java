package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    string bin = ""
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
}
