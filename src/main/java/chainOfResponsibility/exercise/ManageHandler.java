package chainOfResponsibility.exercise;

public class ManageHandler implements SortAlgorithm{
    private SortAlgorithm next;

    @Override
    public void setNext(SortAlgorithm handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        Quicksort resp1= new Quicksort();
        this.setNext(resp1);

        BubbleSort resp2 = new BubbleSort();
        resp1.setNext(resp2);

        MergeSort resp3 = new MergeSort();
        resp2.setNext(resp3);


        this.next().criteriaHandler(personas);


    }

    @Override
    public SortAlgorithm next() {
        return next;
    }
}
