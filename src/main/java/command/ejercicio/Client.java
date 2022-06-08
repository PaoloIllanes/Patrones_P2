package command.ejercicio;


public class Client {

    public static void main (String[]args){
        Game game = new Game();
        game.setNombre("Call of duty");
        game.setPlataforma("PS4");

       Atacar atacar= new Atacar(game);
       ModoDefensa modoDefensa = new ModoDefensa(game);
       Disparar disparar= new Disparar(game);

       Console console= new Console();

       console.addCommand(atacar);
       console.addCommand(modoDefensa);
       console.addCommand(disparar);


       console.makeCommands();





    }

}
