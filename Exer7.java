import java.util.Scanner;

public class Exer7 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        Integer h, b, B, resultado;
        
        System.out.println("Digite a altura do trapésio: ");
        h = entrada.nextInt();
        System.out.println("Digite a base menor do trapésio: ");
        b = entrada.nextInt();
        System.out.println("Digite a base maior do trapésio: "); 
        B = entrada.nextInt();
        
        
        resultado = (h * (b + B))/2;
        
        System.out.println("A altura do trapésio é: " + resultado);
        
entrada.close();





    }
    
}