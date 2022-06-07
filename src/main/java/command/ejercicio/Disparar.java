package command.ejercicio;

public class Disparar implements ICommand{
    private Game game;

    public Disparar(Game game){
        this.game=game;
    }

    @Override
    public void execute() {
        System.out.println("executing command: Character Shot");
        game.personajeDisparar();

    }
}