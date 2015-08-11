/**
 * Created by karthikr on 11/08/15.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class isostriangle {

    public static void main(String []args)
    {
      int n,m;
      Scanner in=new Scanner(System.in);
        System.out.println("Enter n:");

        n=in.nextInt();
        m=n+n-1;


        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(m/2);

        for(int i=0;i<n;++i)
        { //System.out.println(a);
            for (int j =0; j<m; ++j)
            {
                 if(a.contains(j))
                 {
                     System.out.print("*");

                 }
                else
                   System.out.print(" ");
            }
          System.out.println("");
          a.add(m/2+i+1);
          a.add(m/2-i-1);
        }







    }


}
