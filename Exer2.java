public class Exer2 {


    public static void main(String[] args) {    
     for (int i = 2; i <= 123; i++) {
         if( Primo(i) )
         System.out.println(i);
         }    
         }

    public static boolean Primo(int numero) {
      for (int x = 2; x < numero; x++) {
      if (numero % x == 0)
      return false;   
      }
     return true;
    }
    


    
}