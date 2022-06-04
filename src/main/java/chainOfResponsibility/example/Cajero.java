package chainOfResponsibility.example;



public class Cajero implements Personal{
    private Personal next;

    @Override
    public void setNext(Personal personal) {
        next=personal;
    }


    @Override
    public void criteriaHandler(Persona persona) {

        if (   !persona.getPagoAlBanco()){
            persona.setPagoAlBanco(true);
            System.out.println("realizando pago al banco");
            next.criteriaHandler(persona);
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public Personal next() {
        return next;
    }
}
