package monstros;

public class ListaAtaques {

    public static final Ataques IMPACTO = new Ataques("impacto", (short) 1, Elementos.NEUTRO, TipoAtaque.FISICO, (byte)15);

    public static final Ataques JATO_DAGUA = new Ataques("Jato dAgua", (short) 2, Elementos.AGUA, TipoAtaque.FISICO, (byte)35);

    public static final Ataques CHUVA_DAGUA = new Ataques("Chuva dAgua", (short) 3, Elementos.AGUA, TipoAtaque.ELEMENTAL, (byte)20);

}
