package mediator.structure;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.sendMsg(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Msg recived: "+msg);
    }
}
