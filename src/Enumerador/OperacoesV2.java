package Enumerador;

import Matematica.OperacaoMatematica;
import Matematica.Soma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by UniCesumar on 23/01/2017.
 */
public enum OperacoesV2 {

    MAIS(new Soma(), "soma", "+", "plus"),
    MAIS(new Soma(), "soma", "+", "plus"),
    MAIS(new Soma(), "soma", "+", "plus"),
    MAIS(new Soma(), "soma", "+", "plus"),
    MAIS(new Soma(), "soma", "+", "plus");

    private OperacaoMatematica operacao;
    private List<String> nomes;

    OperacoesV2(OperacaoMatematica operacao, String... nomes) {
        this.operacao = operacao;
        this.nomes = Arrays.asList(nomes);
    }

    public static OperacoesV2 fromValue(String name) {
        for (OperacoesV2 operacao : OperacoesV2.values()) {
            if (operacao.nomes.contains(name.toLowerCase())) return operacao;
        }
        throw new IllegalArgumentException("Operação nao conhecida");
    }

//    public Parser getParserFor(Class<?> klazz) {
//      return parsers.get(klazz);
//    }

//    MAIS {
//        @Override
//        OperacaoMatematica getOperacao() {
//            return new Soma();
//            return Soma.class;
//        }
//    }, MENOS {
//        @Override
//        OperacaoMatematica getOperacao() {
//            return new Subtracao();
//        }
//    }, VEZES {
//        @Override
//        OperacaoMatematica getOperacao() {
//            return new Multiplicacao();
//        }
//    }, DIVIDIDO {
//        @Override
//        OperacaoMatematica getOperacao() {
//            return new Divisao();
//        }
//    }, RESTO {
//        @Override
//        OperacaoMatematica getOperacao() {
//            return new Resto();
//        }
//    }, MAIOR {
//        @Override
//        OperacaoMatematica getOperacao() {
//            return null;
//        }
//    };
//
//    public double calcular(double a, double b) {
//        return getOperacao().calcula(a, b);
//    }
//
//    abstract OperacaoMatematica getOperacao();
//
//    public static OperacoesV2 getValue(String name) {
//        name = name                .toUpperCase();
//        switch (name) {
//            case "X":
//            case "MULTIPLICACAO":
//                return VEZES;
//            case "+":
//            case "SOMA":
//                return MAIS;
//            case "-":
//            case "SUBTRACAO":
//                return MENOS;
//            case "/":
//            case "DIVISAO":
//                return DIVIDIDO;
//            case "%":
//                return RESTO;
//            default:
//                return valueOf(name);
//        }
//    }

}
