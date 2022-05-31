package iterator.example;

import java.util.ArrayList;
import java.util.List;

public class AgregateImportadora2 implements IAgragateImportadora{

    private List<Automovil> automoviles;

    public AgregateImportadora2(){
        automoviles= new ArrayList<>();
    }

    public void add(Automovil value){

        automoviles.add(value);

    }

    @Override
    public IteratorImportadora2 createIterator() {

        return new IteratorImportadora2(automoviles);
    }
}
