package command.ejercicio;

public class ModoDefensa implements ICommand{
    private Game game;

    public ModoDefensa(Game game){
        this.game=game;
    }

    @Override
    public void execute() {
        System.out.println("executing command: Character defense mode");
        game.personajeModoDefensa();

    }
}
