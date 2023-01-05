import java.util.Scanner; 

public class EvenNumber {
 

    public static void main(String[] args) {

         System.out.println( "Here is the result of your input" ); 
        System.out.println(); 
 
        Scanner consoleInput =  new  Scanner(System.in); 
 
        System.out.println( "Your Input: " ); 
         long  number = consoleInput.nextLong(); 
         System.out.println(number);
        System.out.println(); 
 
         boolean  isEven= true ; 
 
         //The thing now  
         if (number %  2  !=  0 ) { 
            isEven =  false ; 
        } 
 
         if (isEven) { 
            System.out.println( "It is an Even Number !!" ); 
        } 
         else  { 
            System.out.println( "Not Even/it's odd!!" ); 
        } 
        System.out.println(); 
 
    } 
} 
