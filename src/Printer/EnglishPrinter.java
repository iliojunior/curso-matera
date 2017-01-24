package Printer;

public class EnglishPrinter extends OutputPrinter {

    @Override
    public void print(double resultado) {
        final String mensagem = String.format("The result is: %.2f", resultado);
        System.out.println(mensagem);
    }
}
