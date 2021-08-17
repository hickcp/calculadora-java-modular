package calculadora.core;

import calculadora.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        System.out.println(calcular.sub(10, 5));
    }
}
