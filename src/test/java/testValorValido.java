import org.junit.*;
import static org.junit.Assert.*;

public class testValorValido extends ValorValido {
    @Test
    public void testIstoEUmValorValido() throws Exception {
        //Given
        double valor = 5000;

        //When
        boolean resultado = istoEUmValorValido(valor);

        //Then
        assertTrue(resultado);
    }

    @Test
    public void testIstoNaoEUmValorValidoCom0() {
        //Given
        double valor = 0;
        String expectedMessage = "Valores abaixo de 0,01 são proibidos";

        //When
        Exception exception = assertThrows(Exception.class,() -> istoEUmValorValido(valor));
        String actualMessage = exception.getMessage();

        //Then
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void testIstoNaoEUmValorValidoCom8000(){
        //Given
        double valor = 8000;
        String expectedMessage = "Valores acima de 7000 são proibidos";

        //When
        Exception exception = assertThrows(Exception.class,() -> istoEUmValorValido(valor));
        String actualMessage = exception.getMessage();

        //Then
        assertEquals(expectedMessage,actualMessage);
    }
}