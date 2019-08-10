import java.util.*;
public class coffee_price{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int p=sc.nextInt();
      int count=0;
      while(x>0)
        {
          count=count+x;
          x=x*(100-p)/100;
        }
      System.out.println(count+"\n");
  }
}

