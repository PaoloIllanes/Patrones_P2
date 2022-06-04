package chainOfResponsibility.structure;

public class Client {
    public static void main(String []args){

        HandlerManager managerHandler= new HandlerManager();
        managerHandler.criteriaHandler(900);

    }
}
