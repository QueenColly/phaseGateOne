import java.util.Scanner;

public class TaskThree{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
for(int index =1 ; index <= 2 ;index++ ){
        System.out.print("Enter a number?  ");
        int number = input.nextInt();
        
         sum += number;
   
}

     System.out.println(sum);

}
}
