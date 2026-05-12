import java.util.*;
public class hello {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       
      String name=sc.nextLine();
      double a=sc.nextDouble();
      sc.nextLine();
      String dept=sc.nextLine();

      System.out.println("My name is: "+name);
        System.out.println("MY Score "+ a/10 +"/10");
        System.out.println("My Department is: "+dept);

}
}