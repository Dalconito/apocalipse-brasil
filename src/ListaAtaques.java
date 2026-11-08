public class ListaAtaques {

    public static Ataques impacto(){
        return new Ataques("impacto", (short) 1, Elementos.NEUTRO, TipoAtaque.FISICO);
    }

    public static Ataques jato_dagua(){
        return new Ataques("Jato de Agua", (short) 2, Elementos.AGUA, TipoAtaque.FISICO);
    }

    public static Ataques chuva_dagua(){
        return new Ataques("Chuva de Agua", (short) 3, Elementos.AGUA, TipoAtaque.ELEMENTAL);
    }

}
