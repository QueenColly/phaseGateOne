import java.util.Scanner;

public class TaskFour{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    
        System.out.print("Enter first number?  ");
       int  number = input.nextInt();

        
        System.out.print("Enter second number?  ");
       int numberTwo  = input.nextInt();


int largest = number;
    if(numberTwo > largest){
        largest = numberTwo;
}
    
        System.out.println(" Largest "+ largest);
}



}

