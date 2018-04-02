package T1;
import java.util.*;
import java.io.*;

class Solution{
    public int Muti(int e, int f){
        int r = 1;
        if(f==0)
         r =1;
        if(f==1)
            r = e;
            else{
            for(int k =0;k<f;k++) 	
            r = r * e;
            }
		return r;
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Solution m = new Solution();
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j= 0;j<n;j++){
              int c = m.Muti(2,j);
              int d = c * b;
              sum += d;
              System.out.print(sum + " ");
            }
              System.out.println("");
        }
        in.close();
    }
}//第一次自己写的函数方法，能运行起来很有成就感！！！

