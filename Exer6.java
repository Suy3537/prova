import java.util.Scanner;
 public class Exer6 {

   public static void main(String[]args) {

    Scanner entrada = new Scanner(System.in);
    float Tlibras, Tquilos;


    System.out.println("Digite a quantidade de libra: ");
    Tlibras = entrada.nextFloat();

    Tquilos = Tlibras /  2.205f;

    System.out.println("A quantidade do valor " + Tlibras + " em quilos é: " + Tquilos);

    System.out.println("Digite a quantidade de quilos:");
    Tquilos = entrada.nextFloat();

    Tlibras = Tquilos * 2.205f;

    System.out.println("A quantidade do valor " + Tquilos + " em libras  é: " + Tlibras);

    entrada.close();

   }
    
}
