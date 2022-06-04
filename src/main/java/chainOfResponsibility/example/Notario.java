package chainOfResponsibility.example;



public class Notario implements Personal{
    private Personal next;

    @Override
    public void setNext(Personal personal) {
        next=personal;
    }


    @Override
    public void criteriaHandler(Persona persona) {

        if (!persona.getCertificadoDeNacimiento()){
            persona.setCertificadoDeNacimiento(true);
            System.out.println("Emitiendo certificado de nacimiento");
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
