public class Monstro {
    public String nome;
    public Elementos elemento_prim;
    public Elementos elemento_secum;
    public byte atk_fis;
    public byte atk_elem;
    public byte def_fis;
    public byte def_elem;
    public byte velocidade;
    public short vida;
    public byte nivel;
    public short experiencia;
    public boolean fisico;

    public Monstro(String nome, Elementos elemento_prim, Elementos elemento_secum, byte atk_fis, byte atk_elem, byte def_fis, byte def_elem, byte velocidade, short vida, byte nivel, short experiencia, boolean fisico) {
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
        this.experiencia = experiencia;
        this.fisico = fisico;

    IO.println(this.nome);
    IO.println(this.fisico);
    }

    public boolean possuiElementoFisico() {
        return elemento_prim.isFisico() ||
                elemento_secum.isFisico();
    }
}
