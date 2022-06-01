import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class JogoPS4Test {

    @Test
    void deveRodarJogoDoPs1()
    {
        ConsoleAdapter consoleAdapter = new ConsoleAdapter();
        Jogo jogoPs1 = consoleAdapter.get1geracao();
        assertEquals(jogoPs1.getGeracao(), "1º geração");
    }

    @Test
    void deveRodarJogoDoPs2()
    {
        ConsoleAdapter consoleAdapter = new ConsoleAdapter();
        Jogo jogoPs2 = consoleAdapter.get2geracao();
        assertEquals(jogoPs2.getGeracao(), "2º geração");
    }

    @Test
    void deveRodarJogoDoPs3()
    {
        ConsoleAdapter consoleAdapter = new ConsoleAdapter();
        Jogo jogoPs3 = consoleAdapter.get3geracao();
        assertEquals(jogoPs3.getGeracao(), "3º geração");
    }

    @Test
    void deveRodarJogoDoPs4()
    {
        ConsoleAdapter consoleAdapter = new ConsoleAdapter();
        Jogo jogoPs4 = consoleAdapter.get4geracao();
        assertEquals(jogoPs4.getGeracao(), "4º geração");
    }

}