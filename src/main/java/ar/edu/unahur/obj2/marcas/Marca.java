package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public abstract class Marca {
    private Double gramosLupulo;
    private Pais pais;
    
    public Marca(Double lupulo, Pais pais) {
        this.gramosLupulo = lupulo;
        this.pais = pais;
    }

    public Double getGramosLupulo() {
        return this.gramosLupulo;
    }

    public Pais getPais() {
        return this.pais;
    }

    public abstract Double graduacion();
}


