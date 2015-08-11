/**
 * Created by karthikr on 11/08/15.
 */
public class FB {

    public static void main(String []args)
    {

        FizzBuzz();


    }

  static void FizzBuzz()
    {
        int i;
         for(i=1;i<=100;++i)
         {

             if(i%3==0 && i%5==0)
             {
                 System.out.println("FizzBuzz");

             }
             else if(i%3==0)
             {
                 System.out.println("Fizz");

             }

             else if(i%5==0)
             {
                 System.out.println("Buzz");

             }

             else
             {
                 System.out.println(i);


             }

         }



    }


}
