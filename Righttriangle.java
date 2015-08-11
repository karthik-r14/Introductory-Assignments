/**
 * Created by karthikr on 11/08/15.
 */
import java.util.Scanner;
public class Righttriangle {

    public static void main(String []args) {
      int n;

      Scanner in=new Scanner(System.in);
      System.out.println("Enter n:");
        n=in.nextInt();

        for(int i=0;i<n;++i)
        {
            for(int j=0;j<i+1;++j)
            {
                System.out.print("*");



            }


            System.out.println("");

        }



    }



}
