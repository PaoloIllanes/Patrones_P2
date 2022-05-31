package iterator.example;

public class IteratorImportadora1 implements IteratorImportadora{

    private int position;
    private Automovil [] automoviles;

    public IteratorImportadora1( Automovil [] automoviles){

        this.automoviles=automoviles;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public Object next() {
        return automoviles[position++];
    }

    @Override
    public boolean hasNext() {
        return automoviles.length != 0 && position < automoviles.length;
    }
}
