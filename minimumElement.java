import java.util.*;
class minimumElement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int min=arr[0];
        int minIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("min element:"+min);
        System.out.println("min index:"+minIndex);
    }
}