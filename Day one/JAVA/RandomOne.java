import java.util.Random;
import java.util.Scanner;

public class RandomOne{
public static void main(String[] args){


    Scanner input = new Scanner(System.in);
//1
    
     int number = 100;
     number = (int)(Math.random() * 100);
        System.out.println(number);

//        Random collect = new Random();
//        int value = collect.nextInt();
//
//2
        
        int outer ;
        int guessInteger;

  for( outer = 1; outer <= 5 ; outer++){
        System.out.print("Enter a number: ");
         guessInteger = input.nextInt();

        if (guessInteger > 100){
            break;
}
        if(outer > 5 ){
            break;
      
            }

        

   else if (guessInteger == 15){
        System.out.println("You got it right . Your number is "+ guessInteger);
            break;
            }

    else if( guessInteger < 15){
        System.out.println("Your input is Lower");
            }

    else if (guessInteger > 15){
        System.out.print("Your input is Higher");



}
        else{

         System.out.print("YOu have exceeded your input");
            break;
           
        }
}


        //String guessInteger = "";

        for( outer = 1 ; outer <= 5; outer++){
        if(guessInteger.equals.charAt() ){
            System.out.print("Error");
}
}


}



}



