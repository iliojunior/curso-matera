package Enumerador;

import Matematica.*;

public enum Operacoes {
    MAIS {
        @Override
        OperacaoMatematica getOperacao() {
            return new Soma();
        }
    }, MENOS {
        @Override
        OperacaoMatematica getOperacao() {
            return new Subtracao();
        }
    }, VEZES {
        @Override
        OperacaoMatematica getOperacao() {
            return new Multiplicacao();
        }
    }, DIVIDIDO {
        @Override
        OperacaoMatematica getOperacao() {
            return new Divisao();
        }
    }, RESTO {
        @Override
        OperacaoMatematica getOperacao() {
            return new Resto();
        }
    };

    public double calcular(double a, double b) {
        return getOperacao().calcula(a, b);
    }

    abstract OperacaoMatematica getOperacao();

    public static Operacoes getValue(String name) {
        name = name                .toUpperCase();
        switch (name) {
            case "X":
            case "MULTIPLICACAO":
                return VEZES;
            case "+":
            case "SOMA":
                return MAIS;
            case "-":
            case "SUBTRACAO":
                return MENOS;
            case "/":
            case "DIVISAO":
                return DIVIDIDO;
            case "%":
                return RESTO;
            default:
                return valueOf(name);
        }
    }
}
