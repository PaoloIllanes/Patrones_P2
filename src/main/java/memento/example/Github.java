package memento.example;

import memento.structure.Memento;

import java.util.HashMap;
import java.util.Map;

public class Github {

    private Map<String,Commit> codeStateList= new HashMap<>();

    public void addCommit(Commit m){

       codeStateList.put(m.getState().getHash(),m);

    }

    public Commit getCommit(String commitHash){
            return codeStateList.get(commitHash);
    }
}
