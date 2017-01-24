import Enumerador.Operacoes;

public class Main {
    public static void main(final String[] args) {
        if(args == null
                || args.length < 3){
            System.out.println("Valor(es) inválido(s)");
            return;
        }

        final double a = Double.parseDouble(args[0]);
        final double b = Double.parseDouble(args[2]);

        Operacoes operacoes;
        try {
            operacoes= Operacoes.getValue(args[1]);
        }catch (IllegalArgumentException e){
            System.out.println("Operação inválida, operações aceitas:");
            System.out.println("Mais | + | Soma");
            System.out.println("Menos | - | Subtracao");
            System.out.println("Vezes | x | Multiplicacao");
            System.out.println("Dividido | / | Divisao");
            System.out.println("Resto | %");
            return;
        }

        new Calculadora().calcular(a,b,operacoes);
    }
}
