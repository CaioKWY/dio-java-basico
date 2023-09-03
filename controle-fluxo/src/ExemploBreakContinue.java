public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break;

            System.out.println(numero);
        }

         for(int numeroX = 6; numeroX <= 11; numeroX ++){
            if(numeroX == 8)
                continue;

            System.out.println(numeroX);
        }
    }
    
}
