package monstros;
import java.util.Set;

public class Agua_Viva extends Monstro {
    public Agua_Viva(byte nivel) {
        super(
                "Agua Viva",
                Elementos.AGUA,
                Elementos.NONE,
                (byte) 1,
                (byte) 4,
                (byte) 2,
                (byte) 3,
                (byte) 0,
                (byte) 2,
                nivel,
                Set.of(
                        ListaAtaques.CHUVA_DAGUA,
                        ListaAtaques.JATO_DAGUA
                )
    );
    }
}
