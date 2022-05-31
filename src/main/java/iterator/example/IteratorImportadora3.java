package iterator.example;

import java.util.Vector;

public class IteratorImportadora3 implements IteratorImportadora{

    private int position;
    private Vector<Automovil> automoviles;

    public IteratorImportadora3 (Vector<Automovil> automoviles){
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

        return automoviles.get(position++);
    }

    @Override
    public boolean hasNext() {

        return automoviles.size() != 0 && position < automoviles.size() ;
    }
}
