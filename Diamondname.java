import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by karthikr on 11/08/15.
 */
public class Diamondname {

    public static void main(String []args)
    {
        int n,m,x=0,flag;
        flag=0;
        ArrayList<Integer> pos=new ArrayList<Integer>();

        System.out.println("Enter n:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();

        System.out.println("Enter name:");
        String Name=in.next();
        m=n+n-1;
        pos.add(m/2);

        for(int i=0;i<m;++i)
        {
            if(i>m/2)
            {
                pos.remove(new Integer(x));
                pos.remove(new Integer(m - x - 1));
                x++;
                flag=1;
            }

            // System.out.println(pos);
            if(i==m/2)
            {System.out.println(Name);
            }
            else {
                for (int j = 0; j < m; ++j) {


                    if (pos.contains(j)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }

                }
                System.out.println("");
            }
            if(flag==0)
            {
                pos.add(m/2+i+1);
                pos.add(m / 2 - i - 1);
            }
        }
    }
}
