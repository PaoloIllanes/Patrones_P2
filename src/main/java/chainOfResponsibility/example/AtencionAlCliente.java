package chainOfResponsibility.example;



public class AtencionAlCliente implements Personal{
    private Personal next;

    @Override
    public void setNext(Personal personal) {
        next=personal;
    }


    @Override
    public void criteriaHandler(Persona persona) {

        if (    (!persona.getCertificadoDeNacimiento()&& persona.getPagoAlBanco())||
                (!persona.getFichaDeAtencion()&& persona.getPagoAlBanco())||
                (!persona.getCertificadoDeNacimiento()&&!persona.getFichaDeAtencion())){

            System.out.println("A la persona le falta mas de 1 requisitos para emitir el carnet");
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
