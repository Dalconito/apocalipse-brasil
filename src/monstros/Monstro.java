package monstros;

import java.util.Set;

public class Monstro {
    public String nome;
    public Elementos elemento_prim;
    public Elementos elemento_secum;
    public byte atk_fis;
    public byte atk_elem;
    public byte def_fis;
    public byte def_elem;
    public byte velocidade;
    public byte vida;
    public byte nivel;
    public byte experiencia;
    public boolean fisico;
    private final Set<Ataques> ataquesPermitidos;

    public Monstro(String nome, Elementos elemento_prim, Elementos elemento_secum, byte atk_fis, byte atk_elem, byte def_fis, byte def_elem,
                   byte velocidade, byte vida, byte nivel,
                   Set<Ataques> ataquesPermitidos) {
        this.nome = nome;
        this.elemento_prim = elemento_prim;
        this.elemento_secum = elemento_secum;
        this.atk_fis = atk_fis;
        this.atk_elem = atk_elem;
        this.def_fis = def_fis;
        this.def_elem = def_elem;
        this.velocidade = velocidade;
        this.vida = vida;
        this.experiencia = 0;
        this.fisico = possuiElementoFisico();
        this.nivel = nivel;
        this.ataquesPermitidos = ataquesPermitidos;
   }

    public boolean possuiElementoFisico() {
        return elemento_prim.isFisico() ||
                elemento_secum.isFisico();
    }

    public boolean permiteAtaques(Ataques ataque){
        return ataquesPermitidos.contains(ataque);
    }
}
