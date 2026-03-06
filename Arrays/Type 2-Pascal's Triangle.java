//Problem Statement:The value of ‘n’ is given and asking to find all the elements of nth row.
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> result=getrow(n);
        for(int ele:result){
            System.out.println(ele);
        }
    }
    public static List<Integer> getrow(int n){
        long x=1;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=n;i++){
            x=x*(n-i+1);
            x=x/i;
            row.add((int)x);
        }
        return row;
    }
}
