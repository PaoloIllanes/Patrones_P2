package command.ejemplo;


public class GenerateBuild implements ICommand {
    private Ide ide;

    public GenerateBuild(Ide ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("executing command: GenerateBuild");
        ide.generateBuild();
    }
}
