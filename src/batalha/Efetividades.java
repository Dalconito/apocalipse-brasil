package batalha;

import monstros.Elementos;
import java.util.Map;

public class Efetividades {
    private static final Map<Elementos, Map<Elementos, Double>> TABELA =
        Map.of(
        Elementos.AGUA, Map.of(
                Elementos.AGUA, 0.5,
                Elementos.FOGO, 2.0,
                Elementos.TERRA, 2.0,
                Elementos.VENENO, 0.5,
                Elementos.ELETRICO, 0.5,
                Elementos.GELO, 0.5,
                Elementos.PLANTA, 0.5
                    ),
        Elementos.FOGO, Map.of(
                Elementos.AGUA, 0.5,
                Elementos.TERRA, 0.5,
                Elementos.VENENO, 2.0,
                Elementos.GELO, 2.0,
                Elementos.PLANTA, 2.0
                    ),
        Elementos.TERRA, Map.of(
                Elementos.AGUA, 0.5,
                Elementos.FOGO, 2.0,
                Elementos.TERRA, 0.5,
                Elementos.AR, 0.0,
                Elementos.VENENO, 0.5,
                Elementos.ELETRICO, 2.0,
                Elementos.GELO, 0.5,
                Elementos.PLANTA, 0.5
                    ),
            Elementos.AR, Map.of(
                Elementos.VENENO, 1.5,
                Elementos.ELETRICO, 2.0,
                Elementos.GELO, 0.5,
                Elementos.PLANTA, 2.0
                    ),
            Elementos.VENENO, Map.of(
                Elementos.AGUA, 2.0,
                Elementos.FOGO, 0.5,
                Elementos.TERRA, 2.0,
                Elementos.AR, 0.0,
                Elementos.VENENO, 0.5,
                Elementos.PLANTA, 2.0
                    ),
            Elementos.ELETRICO, Map.of(
                Elementos.AGUA, 2.0,
                Elementos.TERRA, 0.0,
                Elementos.AR, 1.5,
                Elementos.ELETRICO, 0.5,
                Elementos.GELO, 0.5,
                Elementos.PLANTA, 0.5
                    ),
            Elementos.GELO, Map.of(
                Elementos.AGUA, 0.5,
                Elementos.FOGO, 0.5,
                Elementos.TERRA, 2.0,
                Elementos.AR, 2.0,
                Elementos.VENENO, 0.5,
                Elementos.ELETRICO, 0.5,
                Elementos.GELO, 0.5,
                Elementos.PLANTA, 2.0
                    ),
            Elementos.PLANTA, Map.of(
                Elementos.AGUA, 0.5,
                Elementos.FOGO, 0.5,
                Elementos.TERRA, 2.0,
                Elementos.AR, 0.5,
                Elementos.VENENO, 0.5,
                Elementos.ELETRICO, 0.5,
                Elementos.GELO, 0.5,
                Elementos.PLANTA, 0.5
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
