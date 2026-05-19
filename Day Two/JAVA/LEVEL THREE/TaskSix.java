import java.util.Scanner;

public class TaskSix{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number?  ");
      int   integer = input.nextInt();
    int count = 0;
   int sum = 0;
    for(int number = 1; number <= integer; number++){
            count++;
   
       sum += count;
       
    
   
}
     //System.out.print(integer);
     System.out.println(sum);
}

}

           
