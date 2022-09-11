import org.junit.*;
import static org.junit.Assert.*;

public class testUnidade extends Unidade{

    @Test
    public void testIstoEhUnidadeTrue(){
        //Given
        int valor = 9;

        //When
        boolean resultado = istoEhUnidade(valor);

        //Then
        assertTrue(resultado);
    }



    @Test
    public void testIstoNaoEhUnidade(){
        //Given
        int valor = 12;

        //When
        boolean resultado = istoEhUnidade(valor);

        //Then
        assertFalse(resultado);
    }
}
