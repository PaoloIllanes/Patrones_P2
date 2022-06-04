package chainOfResponsibility.structure;

public class HandlerManager  implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        ConcreteHandler1 resp1= new ConcreteHandler1();
        this.setNext(resp1);

        ConcreteHandler2 resp2 = new ConcreteHandler2();
        resp1.setNext(resp2);


    }

    @Override
    public IHandler next() {
        return next;
    }
}
