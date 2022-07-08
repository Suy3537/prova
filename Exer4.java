import java.util.Scanner;
public class Exer4 {



public static void main (String[]args){

Scanner entrada = new Scanner(System.in);
float horasTrab, total;

System.out.println("Digite as horas trabalhadas: ");
horasTrab = entrada.nextFloat();

total = horasTrab * 10.25f;

System.out.println("o salário total dele é de " + total);
        
entrada.close();




}


  
}