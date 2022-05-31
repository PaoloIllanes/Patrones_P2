package iterator.example;

import java.util.Stack;

public class IteratorImportadora4 implements IteratorImportadora{

    int position;
    Stack<Automovil> automoviles;

    public IteratorImportadora4(Stack<Automovil> automoviles) {
        this.automoviles= automoviles;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public Object next() {
        return automoviles.pop();
    }

    @Override
    public boolean hasNext() {
        return !automoviles.isEmpty();
    }
}
