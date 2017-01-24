package Printer;

public class PortuguesePrinter extends OutputPrinter {
    @Override
    public void print(double resultado) {
        final String mensagem = String.format("O resultado é: %.2f", resultado);
        System.out.println(mensagem);
    }
}
