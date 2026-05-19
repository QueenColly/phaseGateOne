import java.util.Scanner;

public class TaskTen{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    
        System.out.print("Enter first number?  ");
       int  number = input.nextInt();

        
   if (number % 5== 0 && number % 3 == 0){
        System.out.print(number);

}    else{
        System.out.println("Not divisible");
}
//    if (number % 3==0){
//        System.out.print(number);
//}
//    else{
//        break;
//}
//
}
}



