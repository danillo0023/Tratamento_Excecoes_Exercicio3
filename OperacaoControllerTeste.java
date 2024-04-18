package excecoes.exercicio3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacaoControllerTeste {
    @Test
    public void testOperacaoValorParPositivo() {
        OperacaoController controller = new OperacaoController();
        int resultado = controller.operacaoValor(4);
        assertEquals(16, resultado);
    }

    @Test
    public void testOperacaoValorImparPositivo() {
        OperacaoController controller = new OperacaoController();
        int resultado = controller.operacaoValor(5);
        assertEquals(125, resultado);
    }

    @Test
    public void testOperacaoValorNumeroNegativo() {
        OperacaoController controller = new OperacaoController();
        assertThrows(ArithmeticException.class, () -> controller.operacaoValor(-1));
    }
}
