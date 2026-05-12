import java.util.Scanner;

class arrc{
    public static void main(String []args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=h;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
