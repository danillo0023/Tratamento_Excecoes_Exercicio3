package excecoes.exercicio3;

public class OperacaoController {
    public int operacaoValor(int numero) throws ArithmeticException {
        if (numero < 0) {
            throw new ArithmeticException("O parâmetro não pode ser negativo.");
        }

        if (numero % 2 == 0) {
            return numero * numero;
        } else {
            return numero * numero * numero;
        }
    }
}
