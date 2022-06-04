package chainOfResponsibility.exercise;

public class MergeSort implements SortAlgorithm {
    private SortAlgorithm next;

    @Override
    public void setNext(SortAlgorithm algorithm) {

        next = algorithm;

    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if (personas.length > 50) {
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


}
