public class Operadores {

    // ----- Operadores aritméticos -----
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    // ----- Operadores de atribuição -----
    public double adicionarEAtribuir(double a, double b) {
        a += b;
        return a;
    }

    public double subtrairEAtribuir(double a, double b) {
        a -= b;
        return a;
    }

    public double multiplicarEAtribuir(double a, double b) {
        a *= b;
        return a;
    }

    public double dividirEAtribuir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return a;
        }
        a /= b;
        return a;
    }

    // ----- Operadores lógicos -----
    public boolean eLogico(boolean x, boolean y) {
        return x && y;
    }

    public boolean ouLogico(boolean x, boolean y) {
        return x || y;
    }

    public boolean negacaoLogica(boolean x) {
        return !x;
    }

    // ----- Operadores de comparação -----
    public boolean igual(double a, double b) {
        return a == b;
    }

    public boolean diferente(double a, double b) {
        return a != b;
    }

    public boolean maiorQue(double a, double b) {
        return a > b;
    }

    public boolean menorQue(double a, double b) {
        return a < b;
    }

    public boolean maiorOuIgual(double a, double b) {
        return a >= b;
    }

    public boolean menorOuIgual(double a, double b) {
        return a <= b;
    }
}
