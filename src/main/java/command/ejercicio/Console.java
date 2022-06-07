package command.ejercicio;


import java.util.ArrayList;
import java.util.List;

public class Console {

    private List<ICommand> commandsGame = new ArrayList<>();

    public Console(){}

    public void addCommand(ICommand command){
        commandsGame.add(command);
    }

    public void makeCommands(){
        for (ICommand command  : commandsGame) {
            command.execute();
        }
        commandsGame.clear();
    }
}
