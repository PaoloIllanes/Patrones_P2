package chainOfResponsibility.example;

import chainOfResponsibility.structure.HandlerManager;

public class Client {
    public static void main(String []args){

      ManagerHandler managerHandler = new ManagerHandler();
      Persona persona = new Persona("Juan",true,false,true);
      managerHandler.criteriaHandler(persona);
    }
}
