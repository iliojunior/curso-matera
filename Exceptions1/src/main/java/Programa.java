import java.text.ParseException;

public class Programa {
    public static final String PATH = "C:\\Arquivos";

    public static void main(String[] args) {
        fazOperacaoComInteiro("1");
    }

    private static void fazOperacaoComInteiro(String s) {
        int valor = Integer.parseInt(s);

        if (valor < 10)
            throw new InteiroMenorQueDezException("asdasdasd");
    }
}