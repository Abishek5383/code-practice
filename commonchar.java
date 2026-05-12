import java.util.Scanner;

class commonchar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                System.out.print("string 1:");

        String s1=sc.next();
                System.out.print("string 2:");

        String s2=sc.next();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    System.out.print(s1.charAt(i)+" ");
                }
            }
        }
        
    }
    }