import java.util.Scanner;

public class TaskFive{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number?  ");
      int   integer = input.nextInt();

    int factorial =1;
    for(int number = 1; number <= integer; number++){
        factorial = factorial * number;
    
    System.out.println(factorial);
}
}

}

           
