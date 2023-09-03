import java.util.concurrent.ThreadLocalRandom; //ajudar a gerar exemplos aleatorios

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        int numeroDoces = 0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: "+valorDoce+" adicionado no Carrinho");
            mesada -= valorDoce;
            numeroDoces++;
        }

        System.out.println("Mesada: "+mesada);
        System.out.println("Joãozinho gastou todo sua mesada em "+numeroDoces+" doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

    
}