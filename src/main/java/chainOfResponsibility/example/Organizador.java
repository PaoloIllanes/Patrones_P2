package chainOfResponsibility.example;



public class Organizador implements Personal{
    private Personal next;

    @Override
    public void setNext(Personal personal) {
        next=personal;
    }


    @Override
    public void criteriaHandler(Persona persona) {

        if ( !persona.getFichaDeAtencion()){
            persona.setFichaDeAtencion(true);
            System.out.println("Brindando ficha de pago");
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
