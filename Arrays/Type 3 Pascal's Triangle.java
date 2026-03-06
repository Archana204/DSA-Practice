//Problem Statement: The Value of Row and Column is Given,the output should be the Value corresponding to the row and col.
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int x=r-1;
        int y=c-1;
        System.out.println(ncr(x,y));
    }
    public static int ncr(int x, int y){
        int res=1;
        for(int i=0;i<y;i++){
            res=res*(x-i);
            res=res/(i+1);
        }
        return res;
    }
}
