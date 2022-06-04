package chainOfResponsibility.exercise;

import java.util.Random;

public class ArrayHandler {

    private static ArrayHandler arrayHandler;

    private ArrayHandler(){}

    public static ArrayHandler getInstance() {

        if(arrayHandler == null) {
            arrayHandler = new ArrayHandler();
        }
        return arrayHandler;
    }
    public Persona[] fillArray(Persona[] personas){
        Random random = new Random();
        for (int i = 0; i < personas.length-1 ; i++) {
            personas[i]= new Persona();
            personas[i].setEdad(random.nextInt( 100- 1) + 1);
            personas[i].setCi(i);
            personas[i].setNombre("persona"+i);


        }
        return personas;
    }
    public void insertionSort(Persona personas[]) {
        int n = personas.length;
        for (int j = 1; j < n; j++) {
            int key = personas[j].getEdad();
            int i = j - 1;
            while ((i > -1) && (personas[i].getEdad() > key)) {
                personas[i + 1] = personas[i];
                i--;
            }
            personas[i + 1].setEdad(key);
        }
    }
}
