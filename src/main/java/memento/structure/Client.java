package memento.structure;

public class Client {

    public static void main(String[]args){

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        ConcreteObject object;

        object = new ConcreteObject("paolo","state1");
        originator.setMemento(object);
        caretaker.addMemento(originator.createMemento());
        object = new ConcreteObject("juan","state2");
        originator.setMemento(object);
        caretaker.addMemento(originator.createMemento());
        object = new ConcreteObject("maria","state3");
        originator.setMemento(object);
        caretaker.addMemento(originator.createMemento());
        object = new ConcreteObject("jose","state4");
        originator.setMemento(object);
        caretaker.addMemento(originator.createMemento());
        object = new ConcreteObject("mario","state5");
        originator.setMemento(object);
        caretaker.addMemento(originator.createMemento());
        object = new ConcreteObject("pedro","state6");
        originator.setMemento(object);
        caretaker.addMemento(originator.createMemento());

        object.showInfo();

    }

}
