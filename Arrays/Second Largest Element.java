//Problem Statement: To find the second largest element of an array.
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int firstlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>firstlargest){
                firstlargest=arr[i];
            }
        }
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>secondlargest && arr[i]<firstlargest){
                secondlargest=arr[i];
            }
            
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("No Second Largest Element in the Array");
        }
        else{
        System.out.println(secondlargest);
        }
    }
}
