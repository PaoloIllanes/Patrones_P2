package iterator.example;

import java.util.Vector;

public class AgregateImportadora3 implements IAgragateImportadora{

    private Vector<Automovil> automoviles;

    public AgregateImportadora3(){
        automoviles= new Vector<>();
    }

    public void add(Automovil value){

        automoviles.add(value);

    }

    @Override
    public IteratorImportadora3 createIterator(){

        return new IteratorImportadora3(automoviles);
    }
}
