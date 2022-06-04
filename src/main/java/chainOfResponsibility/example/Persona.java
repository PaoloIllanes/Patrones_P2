package chainOfResponsibility.example;

public class Persona {

    private boolean certificadoDeNacimiento;
    private boolean pagoAlBanco;
    private boolean fichaDeAtencion;
    private String nombre;
    private int ci;

    public Persona(String nombre,boolean certificadoDeNacimiento,boolean pagoAlBanco,boolean fichaDeAtencion){
        this.nombre= nombre;
        this.certificadoDeNacimiento=certificadoDeNacimiento;
        this.pagoAlBanco=pagoAlBanco;
        this.fichaDeAtencion=fichaDeAtencion;
        ci=0;
    }

    public void ahowInfo(){
        System.out.println("Nombre :"+nombre);
        System.out.println("Certificado :"+certificadoDeNacimiento);
        System.out.println("Pago al banco :"+pagoAlBanco);
        System.out.println("Ficha de atencion :"+nombre);
    }


    public boolean getCertificadoDeNacimiento() {
        return certificadoDeNacimiento;
    }

    public void setCertificadoDeNacimiento(boolean certificadoDeNacimiento) {
        this.certificadoDeNacimiento = certificadoDeNacimiento;
    }

    public boolean getPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public boolean getFichaDeAtencion() {
        return fichaDeAtencion;
    }

    public void setFichaDeAtencion(boolean fichaDeAtencion) {
        this.fichaDeAtencion = fichaDeAtencion;
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
