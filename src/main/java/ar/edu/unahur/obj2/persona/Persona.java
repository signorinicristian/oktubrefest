package ar.edu.unahur.obj2.persona;

import java.util.List;
import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;


public abstract class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean leGustaTradicional;
    private Integer nivelAguante;

    public Persona(Double peso, List<Jarra> jarrasCompradas, Boolean leGustaTradicional, Integer nivelAguante) {
        this.peso = peso;
        this.jarrasCompradas = jarrasCompradas;
        this.leGustaTradicional = leGustaTradicional;
        this.nivelAguante = nivelAguante;
    }

    public Double getPeso() {
        return peso;
    }

    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }

    public Boolean getLeGustaTradicional() {
        return leGustaTradicional;
    }
    
    public Integer getNivelAguante() {
        return nivelAguante;
    }

    public Double totalAlcoholConsumido() {
        return jarrasCompradas.stream()
                .mapToDouble(j -> j.cantidadDeAlcohol())
                .sum();
    }

    public Boolean estaEbria() {
        return (this.totalAlcoholConsumido() * this.peso) > this.nivelAguante;
    }
    
    protected abstract Boolean leGustaMarca(Marca unaMarca);

    public Boolean leGusta(Marca unaMarca) {
        return this.leGustaMarca(unaMarca);
    }
}
