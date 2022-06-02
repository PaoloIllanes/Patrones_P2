package memento.exercise;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args){

        DBManager manager = new DBManager();
        DBServer server = new DBServer();

        Database db;
        db= new Database("PersonDatabase");
        db.setBackupName("BackupMayo");
        db.addPersons(new Persona("juan",123,22));
        server.setBackup(db);
        manager.addBackup(server.createBackup());

        db= new Database("PersonDatabase");
        db.setBackupName("BackupJunio");
        db.addPersons(new Persona("juan",123,22));
        db.addPersons(new Persona("jose",232,22));
        db.addPersons(new Persona("pablo",234,22));
        db.removePerson(123);
        server.setBackup(db);
        manager.addBackup(server.createBackup());


        db=server.restoreDatabase(manager.getBackup("BackupJunio"));
        db.showInfo();

    }
}
