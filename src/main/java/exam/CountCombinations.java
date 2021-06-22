package exam;
import util.*;
import java.io.*;
public class CountCombinations {
  
  public static void main(String[] args){
      int sum;
      int[] arr=new int[100];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sum :");
      sum = sc.nextLine();
      System.out.println("Enter the numbers :");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextLine();
      }
    getNumberOfWays(arr,no);
  }
 public int getNumberOfWays(int[] candidates, int target) {
     List<List<Integer>> result=new ArrayList<>();
        recur(candidates,0,target,result,new ArrayList());
        System.out.println(result)
        return 0;
    }
    public void recur(int[] c,int start,int target,List<List<Integer>> result,List<Integer> list)
    {
        if(target<0)
            return;
        if(target==0)
            result.add(new ArrayList(list));
        for(int i=start;i<c.length;i++)
        {
            list.add(c[i]);
            recur(c,i,target-c[i],result,list);
            list.remove(list.size()-1);
        }
    }

}
