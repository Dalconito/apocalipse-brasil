package monstros;
import java.util.Set;

public class Tartaruga extends Monstro {
    public Tartaruga(byte nivel){
        super(
                "Tartaruga",
                Elementos.AGUA,
                Elementos.NEUTRO,
                (byte)3,
                (byte)3,
                (byte)5,
                (byte)2,
                (byte)1,
                (byte)5,
                nivel,
                Set.of(
                        ListaAtaques.CHUVA_DAGUA,
                        ListaAtaques.JATO_DAGUA)
        );

    }

    public short vida(){
        return (short)(this.nivel * this.vida);
    }

    public void usarAtaque(Ataques ataque){
        if(!permiteAtaques(ataque)) {
            IO.println("Nao pode utilizar este ataque");
            return;
        }
        IO.println("Tartaruga usou o ataque: " + ataque.nome + ". E aplicara " + ataque.danoBase + " De dano base");
    }

}
