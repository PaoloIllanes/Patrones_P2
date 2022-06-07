package command.ejercicio;

public class Game {
    private String nombre;
    private String plataforma;

    public Game(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void personajeModoDefensa(){

        System.out.println("Cambiando personaje a modo defensa");

    }
    public void personajeModoAtaque(){

        System.out.println("Cambiando personaje a modo ataque");

    }
    public void personajeDisparar(){

        System.out.println("Personaje dispara");

    }
}
