public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.5;

        if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de recuperação");

        else
        System.out.println("Reprovado");
    }
}
