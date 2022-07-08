import java.util.Scanner;

public class Exer8 {


        public static void main(String[]args){
    
            Scanner entrada = new Scanner(System.in);
            Float h, b, B, resultado;
            
            System.out.println(" Digite a altura do trapésio: ");
            h = entrada.nextFloat();
            System.out.println(" Digite a base menor do trapésio: ");
            b = entrada.nextFloat();
            System.out.println(" Digite a base maior do trapésio: "); 
            B = entrada.nextFloat();
            
            
            resultado = (h * (b + B))/2;          
            System.out.println(" A altura do trapésio é: " + resultado);
            
            System.out.println(" Sua forma inteira (número arredondado) é: " + Math.ceil(resultado));
    
    
            entrada.close();
    
    
        }
        

    
}