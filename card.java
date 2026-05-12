import java.util.*;
class card{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int score=0;
        for(int i=0;i<n;i++){
            if(arr[i]==11) score+=3;
            else if(arr[i]==9) score+=2;
            else if(arr[i]==10||arr[i]==1) score+=1;
        }
        System.out.println(score);
    }

}