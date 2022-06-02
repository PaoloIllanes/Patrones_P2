package memento.exercise;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private Map<Integer,Persona> dbUsers;
    private String dbName;
    private String backupName;

    public Database(String dbName){
        dbUsers= new HashMap<>();
    }

    public void showInfo(){
        for (Integer ci: dbUsers.keySet()) {
            System.out.println("*************************");
            dbUsers.get(ci).showInfo();

        }
    }
    public void addPersons(Persona persona){

        dbUsers.put(persona.getCi(),persona);

    }

    public void removePerson(int ci){
        dbUsers.remove(ci);
    }

    public Map<Integer, Persona> getDbUsers() {
        return dbUsers;
    }

    public void setDbUsers(Map<Integer, Persona> dbUsers) {
        this.dbUsers = dbUsers;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }
}
