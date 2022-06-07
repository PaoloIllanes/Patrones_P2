package command.ejercicio;


public class Atacar implements ICommand{
    private Game game;

    public Atacar(Game game){
        this.game=game;
    }

    @Override
    public void execute() {
        System.out.println("executing command: Character attack mode");
        game.personajeModoAtaque();

    }
}
