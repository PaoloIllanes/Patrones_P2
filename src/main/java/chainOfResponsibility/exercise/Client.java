package chainOfResponsibility.exercise;

import java.util.Random;

public class Client {
    public static void main(String[]args){
        ManageHandler manageHandler = new ManageHandler();
        Persona[] personas1 = new Persona[20];
        ArrayHandler.getInstance().fillArray(personas1);
        Persona[] personas2 = new Persona[50];
        ArrayHandler.getInstance().fillArray(personas2);
        Persona[] personas3 = new Persona[60];
        ArrayHandler.getInstance().fillArray(personas3);

        manageHandler.criteriaHandler(personas1);
        //manageHandler.criteriaHandler(personas2);
        // manageHandler.criteriaHandler(personas3);

    }


}
