package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class Rubia extends Marca{
    private Double graduacion;

    public Rubia(Double gramosLupulo, Pais pais, Double graduacion) {
        super(gramosLupulo, pais);
        this.graduacion = graduacion;
    }

    @Override
    public Double graduacion() {
        return this.graduacion;
    }
}
