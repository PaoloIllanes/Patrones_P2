package memento.exercise;


public class Backup {

    private Database state;

    public Backup(Database database){
        state= database;
    }

    public Database getDatabase(){
        return state;
    }

}
