package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class Roja extends Negra {
    public Roja(Double gramosLupulo, Pais pais) {
        super(gramosLupulo, pais);
    }

    @Override
    public Double graduacion() {
        return Math.min(this.getGramosLupulo() * 2, this.graduacionReglamentaria) * 1.25;
    }
}
