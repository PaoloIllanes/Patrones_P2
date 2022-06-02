package iterator.example;


import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[]args){

        Map<Integer,Automovil>aduana = new HashMap<>();
        int key=0;

        AgregateImportadora1 importadora1 = new AgregateImportadora1();
        importadora1.add(new Automovil(2000,"Lada",5,1));
        importadora1.add(new Automovil(3000,"Suzuki",4,2));
        importadora1.add(new Automovil(4000,"Porsche",4,3));
        importadora1.add(new Automovil(2000,"Toyota",6,3));
        importadora1.add(new Automovil(3000,"Daihatsu",7,2));
        importadora1.add(new Automovil(5000,"Volkswagen",5,3));

        AgregateImportadora2 importadora2 = new AgregateImportadora2();
        importadora2.add(new Automovil(2000,"Lada",5,1));
        importadora2.add(new Automovil(3000,"Suzuki",4,2));
        importadora2.add(new Automovil(4000,"Porsche",4,3));
        importadora2.add(new Automovil(2000,"Toyota",6,3));
        importadora2.add(new Automovil(3000,"Daihatsu",7,2));
        importadora2.add(new Automovil(5000,"Volkswagen",5,3));

        AgregateImportadora3 importadora3 = new AgregateImportadora3();
        importadora3.add(new Automovil(2000,"Lada",5,1));
        importadora3.add(new Automovil(3000,"Suzuki",4,2));
        importadora3.add(new Automovil(4000,"Porsche",4,3));
        importadora3.add(new Automovil(2000,"Toyota",6,3));
        importadora3.add(new Automovil(3000,"Daihatsu",7,2));
        importadora3.add(new Automovil(5000,"Volkswagen",5,3));

        AgregateImportadora4 importadora4 = new AgregateImportadora4();
        importadora4.add(new Automovil(5000,"Lada",5,1));
        importadora4.add(new Automovil(4000,"Suzuki",4,2));
        importadora4.add(new Automovil(3000,"Porsche",4,3));
        importadora4.add(new Automovil(2000,"Toyota",6,3));
        importadora4.add(new Automovil(3000,"Daihatsu",7,2));
        importadora4.add(new Automovil(3000,"Volkswagen",5,3));

        IteratorImportadora iterator;

        iterator= importadora1.createIterator();

        while (iterator.hasNext()){
            Automovil auto = (Automovil) iterator.next();
            System.out.println("Importadora1");
            System.out.println("Modelo : "+auto.getModelo());
            System.out.println("Costo : "+auto.getCosto());
            System.out.println("Numero de Asientos : "+auto.getnAsientos());
            System.out.println("Tipo : "+auto.getTipo());
            System.out.println("**************************");
            aduana.put(key,auto);
            key++;

        }

        iterator=importadora2.createIterator();

        while (iterator.hasNext()){
            Automovil auto = (Automovil) iterator.next();
            System.out.println("Importadora2");
            System.out.println("Modelo : "+auto.getModelo());
            System.out.println("Costo : "+auto.getCosto());
            System.out.println("Numero de Asientos : "+auto.getnAsientos());
            System.out.println("Tipo : "+auto.getTipo());
            System.out.println("**************************");
            aduana.put(key,auto);
            key++;

        }

        iterator=importadora3.createIterator();

        while (iterator.hasNext()){
            Automovil auto = (Automovil) iterator.next();
            System.out.println("Importadora3");
            System.out.println("Modelo : "+auto.getModelo());
            System.out.println("Costo : "+auto.getCosto());
            System.out.println("Numero de Asientos : "+auto.getnAsientos());
            System.out.println("Tipo : "+auto.getTipo());
            System.out.println("**************************");
            aduana.put(key,auto);
            key++;

        }

        iterator=importadora4.createIterator();

        while (iterator.hasNext()){
            Automovil auto = (Automovil) iterator.next();
            System.out.println("Importadora4");
            System.out.println("Modelo : "+auto.getModelo());
            System.out.println("Costo : "+auto.getCosto());
            System.out.println("Numero de Asientos : "+auto.getnAsientos());
            System.out.println("Tipo : "+auto.getTipo());
            System.out.println("**************************");
            aduana.put(key,auto);
            key++;

        }
        System.out.println("Numero de Autos: "+aduana.size());





    }
}
