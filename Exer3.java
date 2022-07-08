import java.util.Scanner;
    public class Exer3 {

    public static void main(String[] args) {
       
          System.out.print("Número: ");
          Scanner numero = new Scanner(System.in);
          int num = numero.nextInt();
            
                if (num % 2  == 1){                  
                    System.out.println("O número " + num + " é impar!");
                    
                   }else{
 
                    if (num > 0) 
                    System.out.println( + num + " é par!");
                   }
               
                   
              if ((num % num == 0) && (num % 1 == 0)) {
                  System.out.println("e " + num + " é primo");
              }else{
                  System.out.println("e " + num + " não é primo");
              }
                   
                
           numero.close();   
    
            
    }  
    }
    
    

