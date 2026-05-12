import java.util.Scanner;

class dupchar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            int flag=0;
            for(int j=0;j<i;j++)
            {
                if(str.charAt(i)==str.charAt(j)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(str.charAt(i));
            }
        }
    }
    }