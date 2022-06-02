package mediator.structure;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(IMediator mediator) {
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
