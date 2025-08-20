import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
         int n=s1.length;
         int height[]=new int[n];
         
         for(int i=0;i<n;i++)
         {
             height[i]=Integer.parseInt(s1[i]);
         }
         int l=0,r=n-1,res=0;
        while(l<r)
        {
            int h=Math.min(height[l],height[r]);
            int width=r-l;
            res=Math.max(res,width*h);
           if(height[l]<height[r])
             l++;
           else
           r--;
        }
        
        System.out.println(res);
    }
}
