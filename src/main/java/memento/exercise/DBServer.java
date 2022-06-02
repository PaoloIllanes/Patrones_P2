package memento.exercise;


public class DBServer {
    private Database state;

    public void setBackup(Database state){
        this.state=state;

    }

    public Backup createBackup(){
        return new Backup(state);
    }

    public Database restoreDatabase(Backup b){
        System.out.println("***** restaurando ****");
        this.state= b.getDatabase();
        return this.state;
    }
}
