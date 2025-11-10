
public class Calculadora {
    public static void main(String[] args) {
        Operadores op = new Operadores();

        // Testes aritméticos
        System.out.println("Soma: " + op.somar(10, 5));
        System.out.println("Subtração: " + op.subtrair(10, 5));
        System.out.println("Multiplicação: " + op.multiplicar(10, 5));
        System.out.println("Divisão: " + op.dividir(10, 5));

        // Testes de atribuição
        System.out.println("Atribuição (+=): " + op.adicionarEAtribuir(10, 5));
        System.out.println("Atribuição (-=): " + op.subtrairEAtribuir(10, 5));
        System.out.println("Atribuição (*=): " + op.multiplicarEAtribuir(10, 5));
        System.out.println("Atribuição (/=): " + op.dividirEAtribuir(10, 5));

        // Testes lógicos
        System.out.println("E lógico (true && false): " + op.eLogico(true, false));
        System.out.println("OU lógico (true || false): " + op.ouLogico(true, false));
        System.out.println("Negação lógica (!true): " + op.negacaoLogica(true));

        // Testes de comparação
        System.out.println("Igualdade (10 == 5): " + op.igual(10, 5));
        System.out.println("Diferença (10 != 5): " + op.diferente(10, 5));
        System.out.println("Maior que (10 > 5): " + op.maiorQue(10, 5));
        System.out.println("Menor que (10 < 5): " + op.menorQue(10, 5));
        System.out.println("Maior ou igual (10 >= 5): " + op.maiorOuIgual(10, 5));
        System.out.println("Menor ou igual (10 <= 5): " + op.menorOuIgual(10, 5));
    }
}
