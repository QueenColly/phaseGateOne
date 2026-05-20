public class Functional{
public static void main(String[]args){


    System.out.println(getSum(5,6));
   
    System.out.println(getEven(6));

    System.out.println(getSquare(6));
    
    System.out.println(getFahrenheit(2));

    System.out.println(getPrime(3));

    System.out.println(getLargest(2,3,4));

    System.out.println(getInterest(24,3,14));

    System.out.println(getArea(2,3));

    int b = 123456;
    System.out.println(getReverse(b));


    String letters = "joyful";
    System.out.println(getCount(letters));
}



public static int getSum(int a, int b){
    int add = a + b;
     return add;
}
  

    public  static boolean getEven(int number){
       
        if(number % 2 == 0){
       return true;

    } return false;
       
      }
    //3
      
public static int getSquare(int a){
    int square = a * a;
     return square;
   
}//4
    public static double getFahrenheit(int celcuis){
    double sum = celcuis * 1.8;
    double fahrenheit = sum + 32;
     return fahrenheit;
}//5
   
    public static boolean getPrime(int a){
   
   boolean prime = false;
    for(int outer = 2; outer <= a ;outer++){
            int count = 0;
        for(int inner = 1; inner <= outer; inner++){
            if(a % outer != 0){
                prime = true;
    }
}
       
}
 return prime;
        
}
//6
    public static int getLargest(int a,int b, int c){
    int largest = a;
        if(b > largest){
           largest = b;
           }
        if(c > largest){
            largest = c;
               
            } //System.out.println(largest);
            return largest;
}
//7
         public static double getInterest(int principal , int rate, int time){
       double result = principal * rate * time / 100;
    
     return result;
}
//8 

    public static int getArea(int length , int width){
        int area = length * width;
        return area;
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

//10
         public static int getCount(String letters){

            String letter = "joyful";
            String news = "";
            int index;
            int count =0;
        for( index = letter.length()-1; index >= 0; index--){
                
            news += letter.charAt(index);
                count++;
      //  System.out.println()
}
        return count;
       
}    
}

