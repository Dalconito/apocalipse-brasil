package monstros;

public enum Elementos {
    NONE(false),
    VENENO(false),
    FOGO(false),
    AR(false),
    AGUA(false),
    ELETRICO(false),
    GELO(true),
    NEUTRO(true),
    TERRA(true),
    PLANTA(true),
    INSETO(true);

    private final boolean fisico;

    Elementos(boolean fisico){this.fisico = fisico;}

    public boolean isFisico(){return fisico;}

    }
