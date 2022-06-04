package chainOfResponsibility.exercise;

public class Persona {

    private int edad;
    private String nombre;
    private int ci;

    public Persona(){

    }

    public void ahowInfo(){
        System.out.println("Nombre :"+nombre);
        System.out.println("ci :"+ci);
        System.out.println("Edad :"+edad);

    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
