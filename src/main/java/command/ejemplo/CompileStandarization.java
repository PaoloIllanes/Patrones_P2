package command.ejemplo;



public class CompileStandarization implements ICommand {
    private Ide ide;

    public CompileStandarization(Ide ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("executing command: CompileStandarization");
        ide.compileStandarizationCode();
    }
}
