package memento.exercise;


import java.util.HashMap;
import java.util.Map;

public class DBManager {

    private Map<String, Backup> backupList= new HashMap<>();

    public void addBackup(Backup b){

    backupList.put(b.getDatabase().getBackupName(),b);

    }

    public Backup getBackup(String backupName){
        return backupList.get(backupName);
    }

}
