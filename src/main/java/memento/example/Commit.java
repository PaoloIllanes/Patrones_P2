package memento.example;


public class Commit {
    private Code state;

    public Commit(Code code){
        state= code;
    }

    public Code getState(){
        return state;
    }
}
