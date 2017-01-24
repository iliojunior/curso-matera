import Enumerador.Operacoes;
import Printer.EnglishPrinter;
import Printer.PortuguesePrinter;

public class Calculadora {
    public void calcular(double a, double b, Operacoes operacoes){

        final double resultado = operacoes.calcular(a,b);

        new PortuguesePrinter().print(resultado);
        new EnglishPrinter().print(resultado);
    }
}