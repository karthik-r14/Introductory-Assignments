/**
 * Created by karthikr on 11/08/15.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Gen {
    public static void main(String []args)
    {
        Gen g=new Gen();
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n:");
        n=in.nextInt();
        System.out.println(g.generate(n));


    }

    ArrayList <Integer> generate(int n)
    {   int flag=0;
        ArrayList<Integer> a=new ArrayList<Integer>();

        for(int i=2;i<n;++i)
        {
            if(n%i==0)
           {
               for(int j=2;j<i/2;++j)
               {
                  if(i%j==0)
                  {
                      flag=1;
                      break;
                  }
               }

           if(flag==0)
           {
              a.add(i);

           }


           }



        }
       // System.out.println(a);
        return a;
    }
}
