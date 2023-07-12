import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(maxMinSum(array,n));
    }
    static int maxMinSum(int array[],int n){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(min>array[i]){
                min=array[i];
            }
            if(max<array[i]){
                max=array[i];
            }
        }
        return min+max;
    }
}
