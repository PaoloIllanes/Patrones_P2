package memento.structure;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> stateList = new ArrayList<>();


    public void addMemento(Memento m){

        stateList.add(m);

    }

    public Memento getMemento(int position){
        return stateList.get(position);
    }

}
