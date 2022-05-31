package iterator.example;

import java.util.Stack;

public class AgregateImportadora4 implements IAgragateImportadora{

    private Stack<Automovil> automoviles;

    public AgregateImportadora4(){
        automoviles= new Stack<>();
    }

    public void add(Automovil value){

        automoviles.push(value);

    }

    @Override
    public IteratorImportadora4 createIterator() {

        return new IteratorImportadora4(automoviles);
    }
}
