import java.util.Scanner;

public class TaskFour{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number?  ");
      int   integer = input.nextInt();

            
    int number= 12;
    int count = 0;
    for(int outer = 1; outer <= number; outer++){
        
    
        count++;
    System.out.println(integer  +" * " + count + " = "+ integer * count);

}
 
}
}

