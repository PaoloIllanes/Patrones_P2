package chainOfResponsibility.example;

import chainOfResponsibility.structure.IHandler;

public interface Personal {

    void setNext(Personal personal);
    void criteriaHandler(Persona persona);
    Personal next();

}
