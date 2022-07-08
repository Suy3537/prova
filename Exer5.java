import java.util.Scanner;

public class Exer5 {

    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        float horasTrab, total;
        
        System.out.println("Digite as horas trabalhadas: ");
        horasTrab = entrada.nextFloat();
        
        total = horasTrab * 10.25f;
        
        System.out.println("o salário total dele é de " + total);
        
        if (total < 50){
            
            System.out.println("Atenção, dirija-se à direção do Hotel!.");
        }
        
        entrada.close();
        
        }
         
}
