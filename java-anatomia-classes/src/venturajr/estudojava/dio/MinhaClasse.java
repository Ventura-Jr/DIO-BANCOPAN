package venturajr.estudojava.dio;

import javax.print.attribute.standard.PrinterLocation;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Edison de Freitas";
        String segundoNome = "Ventura Junior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
