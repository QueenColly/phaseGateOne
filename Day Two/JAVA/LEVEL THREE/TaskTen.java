public class TaskTen{
public static void main(String[]args){


   String word = "number";
    String news = "";
for(int index = word.length()-1; index>= 0; index--){

        news += word.charAt(index);

}
        
        System.out.println(word.length());
}
}



  //9
     public static int getReverse(int b){
       
       int a = 123456;
        int reversed = 0;
    while(a != 0){
    int digit = a % 10;
    reversed = reversed * 10 + digit;
    a = a/ 10;
    
}
  return reversed;
}
