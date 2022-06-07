package command.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class MakeBuild {
    private List <ICommand> commandsIde = new ArrayList<>();

    public MakeBuild(){}

    public void addCommand(ICommand command){
        commandsIde.add(command);
    }

    public void makeBuildCmd(){
        for (ICommand command  : commandsIde) {
            command.execute();
        }
        commandsIde.clear();
    }
}
