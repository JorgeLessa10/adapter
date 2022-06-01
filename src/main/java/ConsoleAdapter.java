import java.util.Arrays;
/*
 ** created by: jorge.lessa
 */
public class ConsoleAdapter extends Console{

    public Jogo get4geracao() {
        return getJogo();
    }

    public Jogo get3geracao(){
        Jogo jogo = getJogo();
        return this.converteJogo(jogo, "3");
    }

    public Jogo get2geracao(){
        Jogo jogo = getJogo();
        return this.converteJogo(jogo, "2");
    }

    public Jogo get1geracao(){
        Jogo jogo = getJogo();
        return this.converteJogo(jogo, "1");
    }

    public Jogo converteJogo(Jogo jogo, String geracao)
    {
        String geracaoAnterior = Arrays.stream(jogo.getGeracao().split("º")).findFirst().get();
        return new Jogo(jogo.getGeracao().replace(geracaoAnterior, geracao));
    }

}
