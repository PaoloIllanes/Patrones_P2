package mediator.structure;

public class ConcreteMediator1 implements IMediator{

    //almacenar todos los objetos a comunicar el mensaje
    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;


    public ConcreteColleague1 getUser1() {
        return user1;
    }

    public void setUser1(ConcreteColleague1 user1) {
        this.user1 = user1;
    }

    public ConcreteColleague2 getUser2() {
        return user2;
    }

    public void setUser2(ConcreteColleague2 user2) {
        this.user2 = user2;
    }

    @Override
    public void sendMsg(String msg, Colleague colleague) {



    }
}
