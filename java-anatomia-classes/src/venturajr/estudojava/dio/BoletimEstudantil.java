package venturajr.estudojava.dio;

public class BoletimEstudantil {

    public static void main(String[] args) {

        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova final");
        else
            System.out.println("Aprovado");
    }
}
