package iterator.example;

public class AgregateImportadora1  implements IAgragateImportadora{
   private int position;
   private Automovil[] automoviles;

   public AgregateImportadora1(){
       automoviles= new Automovil[6];
   }

   public void add(Automovil value){

       automoviles[position]= value;
       position++;
   }

    @Override
    public IteratorImportadora1 createIterator() {
        return new IteratorImportadora1(automoviles);
    }
}
