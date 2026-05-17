package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class Negra extends Marca {
    protected Double graduacionReglamentaria = 0.05;

    public Negra(Double gramosLupulo, Pais pais) {
        super(gramosLupulo, pais);
    }

    @Override
    public Double graduacion() {
        return Math.min(this.getGramosLupulo() * 2, this.graduacionReglamentaria);
    }

    public void setGraduacionReglamentaria(Double nuevaGraduacion) {
        this.graduacionReglamentaria = nuevaGraduacion;
    }
}
