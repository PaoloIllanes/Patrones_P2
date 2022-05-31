package iterator.example;

import java.util.List;

public class IteratorImportadora2 implements IteratorImportadora{

    private int position;
    private List<Automovil> automoviles;

    public IteratorImportadora2(List<Automovil> automoviles){
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

        return automoviles.get(position++) ;
    }

    @Override
    public boolean hasNext() {

        return automoviles.size()!=0 && position<automoviles.size();

    }
}
