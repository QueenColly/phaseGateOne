import java.util.Scanner;

public class TaskEight{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
              System.out.print("Enter a number?  ");
                int   integer = input.nextInt();
    
       
                
    //    int number= 12;
    //    int count = 0;
    //   while(number > 0){
    //          System.out.print("Enter a number?  ");
    //      int   integer = input.nextInt();
    //
    //}
            
        
    //        count++;
    //    System.out.println(integer  +" * " + count + " = "+ integer * count);
    //
    //}


     
       int multiples = 1;
        int count = 1;
       // int number ;

        for(int outer = integer; outer > 0; outer -- ){
            multiples *= count ;
               count++;
                    
        }
        
        System.out.println(multiples);
    }
}

