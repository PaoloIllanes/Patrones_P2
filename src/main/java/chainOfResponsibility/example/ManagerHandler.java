package chainOfResponsibility.example;


public class ManagerHandler implements Personal{
    private Personal next;

    @Override
    public void setNext(Personal handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        AtencionAlCliente resp1= new AtencionAlCliente();
        this.setNext(resp1);

        Notario resp2 = new Notario();
        resp1.setNext(resp2);

        Organizador resp3 = new Organizador();
        resp2.setNext(resp3);

        Cajero resp4 = new Cajero();
        resp3.setNext(resp4);

        Segip resp5 = new Segip();
        resp4.setNext(resp5);

        this.next().criteriaHandler(persona);


    }

    @Override
    public Personal next() {
        return next;
    }
}
