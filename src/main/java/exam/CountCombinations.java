package exam;
import.util.Scanner;
public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    int last;
    last=total[k-1];
    for(int i=no-1;i>0;i++)
    {
        total[i]=total[i-1];
    }
    total[0] = last;
    for(int i=0;i<no;i++)
    {
        System.ou.println(total[i]+"");
    }
    return 0;
  }
  public static void main(String[] args){
      int no;
      int[] arr=new int[100];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no of element you want to enter :");
      no = sc.nextLine();
      System.out.println("Enter the numbers :");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextLine();
      }
    getNumberOfWays(arr,no);
  }

}
