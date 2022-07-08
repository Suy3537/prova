public class Exer1 {

    public static void main(String[] args) {
    
         long numeroPar = 1;
         int numeroImper = 0;
         
    
        for (int num = 0; num <= 30 ; num++){
                      
        
        if (num % 2  == 1) {
        numeroImper += num;
        
       }else{
       
        if (num > 0) 
        numeroPar *= num;  
       }
        
     System.out.println("a soma dos numeros impares é: " + numeroImper );
     System.out.println(" e a multiplicação dos numeros pares é: " + numeroPar);
        
    }   
    }
    }