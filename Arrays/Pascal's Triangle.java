//Problem Statement: Complete Pascal triangle Should be Printed based on the value of the N, where N=no.of rows.
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> result=generate(n);
        for(List<Integer> rows: result){
            System.out.println(rows);
        }
    }
    public static List<List<Integer>> generate(int n){
            List<List<Integer>> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                ans.add(getrow(i));
            }
            return ans;
        }
    public static List<Integer> getrow(int rowindex){
        long x=1;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=rowindex;i++){
            x=x*(rowindex-i+1);
            x=x/i;
        row.add((int)x);
        }
        return row;
    }
}
