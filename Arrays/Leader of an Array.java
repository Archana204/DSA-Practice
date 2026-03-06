//Problem Statement: When ever the right side elements of an element are less than the element then the element is said to be a Leader.
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
        int leader[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int j;
            for( j=i+1;j<n;j++){
                if(arr[j]> arr[i]){
                    break;
                }
            }
            if(j==n){
            leader[k]=arr[i];
            k++;
        }
        }
        for(int i=0;i<k;i++){
            System.out.print(leader[i]+" ");
        }
    }
}
