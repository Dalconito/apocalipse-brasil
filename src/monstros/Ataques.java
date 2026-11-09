package monstros;

import java.util.UUID;

public class Ataques {
    private UUID id;
    public short codigo;
    public String nome;
    public Elementos elemento;
    public TipoAtaque tipo;
    public byte danoBase;

    public Ataques(String nome, short codigo, Elementos elemento, TipoAtaque tipo, byte danoBase){
        this.codigo = codigo;
        this.nome = nome;
        this.elemento = elemento;
        this.tipo = tipo;
        this.danoBase = danoBase;
    }
}
