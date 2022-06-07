package command.ejemplo;



public class CleanBuildFolder implements ICommand {
    private Ide ide;

    public CleanBuildFolder(Ide ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("executing command: CleanBuildFolder");
        ide.removenBuildFolder();
        ide.cleanBuildFolder();
    }
}
