package ar.edu.unahur.obj2.persona;

import java.util.List;

import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public class Checo extends Persona {
    public Checo(Double peso, List<Jarra> jarrasCompradas, Boolean leGustaTradicional, Integer nivelAguante) {
        super(peso, jarrasCompradas, leGustaTradicional, nivelAguante);
    }

    @Override
    public Boolean leGustaMarca(Marca unaMarca) {
        return unaMarca.graduacion() > 8;
    }
}
