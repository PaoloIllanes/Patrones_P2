package chainOfResponsibility.example;


import java.util.Random;

public class Segip implements Personal{
    private Personal next;

    @Override
    public void setNext(Personal personal) {
        next=personal;
    }


    @Override
    public void criteriaHandler(Persona persona) {

        if (persona.getPagoAlBanco()&&persona.getCertificadoDeNacimiento()&&persona.getFichaDeAtencion()){
            Random random = new Random();
            int ci=random.nextInt( 1000- 1) + 1;
            persona.setCi(ci);
            System.out.println("Emitiendo carnet con el numero : "+persona.getCi());
        } else {
            next.criteriaHandler(persona);
        }

    }

    @Override
    public Personal next() {
        return next;
    }
}
