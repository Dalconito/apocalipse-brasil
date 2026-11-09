import batalha.Efetividades;
import monstros.Elementos;
import monstros.ListaAtaques;
import monstros.Tartaruga;
void main() {

//    Tartaruga tartaruga = new Tartaruga((byte)5);
//
//    tartaruga.usarAtaque(ListaAtaques.CHUVA_DAGUA);
//    tartaruga.usarAtaque(ListaAtaques.IMPACTO);
    IO.println(Efetividades.consultar(Elementos.AGUA, Elementos.ELETRICO));
}
