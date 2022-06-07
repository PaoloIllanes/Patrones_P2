package command.ejemplo;

public class RunTest implements ICommand{
    private Ide ide;

    public RunTest(Ide ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("executing command: RunTest");
        ide.runUnitTest();
    }
}
