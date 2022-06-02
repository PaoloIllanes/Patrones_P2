package memento.structure;

public class Originator {
    private ConcreteObject state;

    public void setMemento(ConcreteObject state){

        System.out.println("Originator State +> "+state.getState());
        this.state=state;

    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void  restoreMemento(Memento m){
        this.state= m.getState();
    }
}
