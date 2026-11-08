import java.util.UUID;

public class Ataques {
    private UUID id;
    public short codigo;
    public String nome;
    public Elementos elemento;
    public TipoAtaque tipo;

    public Ataques(String nome, short codigo, Elementos elemento, TipoAtaque tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.elemento = elemento;
        this.tipo = tipo;
    }
}
