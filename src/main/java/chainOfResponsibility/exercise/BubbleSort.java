package chainOfResponsibility.exercise;

public class BubbleSort implements SortAlgorithm {
    private SortAlgorithm next;

    @Override
    public void setNext(SortAlgorithm algorithm) {

        next = algorithm;

    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if (personas.length <= 50) {
            ArrayHandler.getInstance().insertionSort(personas);
            for (int i = 0; i < personas.length; i++) {
                personas[i].ahowInfo();
            }

        }

    }

    @Override
    public SortAlgorithm next() {
        return next;
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
