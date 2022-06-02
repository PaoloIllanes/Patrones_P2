package memento.exercise;

public class Persona {

    private String name;
    private Integer ci;
    private int edad;


    public Persona(String name,Integer ci,int edad){
        this.edad=edad;
        this.name=name;
        this.ci=ci;
    }
    public void showInfo(){
        System.out.println("CI: "+ci);
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+edad);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
