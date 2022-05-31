package iterator.example;

public class Automovil {
    int costo;
    String modelo;
    int nAsientos;
    int tipo;
    public Automovil( int costo, String modelo,int nAsiento,int tipo){
        this.costo =costo;
        this.modelo=modelo;
        this.nAsientos=nAsiento;
        this.tipo=tipo;

    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
