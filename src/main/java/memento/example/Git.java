package memento.example;



public class Git {

    private Code state;

    public void setCommit(Code state){
        this.state=state;
    }

    public Commit createCommit(){
        return new Commit(state);
    }

    public void  restoreCommit(Commit m){
        this.state= m.getState();
    }

}
