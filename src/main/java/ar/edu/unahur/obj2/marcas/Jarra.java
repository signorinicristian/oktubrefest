package ar.edu.unahur.obj2.marcas;

public class Jarra {
    private Double capacidadLitros;
    private Marca marca;

    public Jarra(Double litros, Marca marca) {
        this.capacidadLitros = litros;
        this.marca = marca;
    }

    public Double getCapacidadLitros() {
        return capacidadLitros;
    }

    public Marca getMarca() {
        return marca;
    }

    public Double cantidadDeAlcohol() {
        return this.capacidadLitros * (this.marca.graduacion() / 100.0);
    }


    
}
