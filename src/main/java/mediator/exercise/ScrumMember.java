package mediator.exercise;



public class ScrumMember extends Colleague {

    private String ci;
    private String Especialidad;
    private String name;
    private String cargo;


    public ScrumMember(ICanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received "+name+">"+message);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidad() { return Especialidad; }

    public void setEspecialidad(String especialidad) { Especialidad = especialidad; }
}
