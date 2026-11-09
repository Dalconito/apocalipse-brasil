package batalha;

import monstros.Elementos;
import java.util.Map;

public class Efetividades {
    private static final Map<Elementos, Map<Elementos, Double>> TABELA =
            Map.of(
                    Elementos.AGUA, Map.of(
                            Elementos.FOGO, 2.0,
                            Elementos.TERRA, 2.0,
                            Elementos.AGUA, 0.5

                    )
            );
    public static double consultar(
            Elementos atacante, Elementos defensor
    ){
        return TABELA
                .getOrDefault(atacante, Map.of())
                .getOrDefault(defensor, 1.0);
    }
}
