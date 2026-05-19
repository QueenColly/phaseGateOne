import java.util.Scanner;

public class TaskFive{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    
        System.out.print("Enter first number?  ");
       int  number = input.nextInt();

        
        System.out.print("Enter second number?  ");
       int numberTwo  = input.nextInt();

          
        System.out.print("Enter second number?  ");
       int numberThree  = input.nextInt();




    int largest = number;
    if(numberTwo > largest){
        largest = numberTwo;
}
     if(numberThree > largest){
        largest = numberThree;
}
    
        System.out.printf("Largest is : %d%n", largest);
}



}

