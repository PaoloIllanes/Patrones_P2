package state.ejercicio;

import java.util.ArrayList;

public class Client {

    public static void main (String [] args){

        MemoriaRAM ram = new MemoriaRAM();
        CPU cpu = new CPU();
        ArrayList<String> programas =  new ArrayList<>();

        IStateComputadora reiniciar = new SatateReiniciar();
        IStateComputadora apagado = new StateApagado();
        IStateComputadora prendido = new StatePrendido();

        Computadora computadora = new Computadora();
        computadora.setCpu(cpu);
        computadora.setProgramasAbiertos(programas);
        computadora.setRam(ram);


        computadora.setState(reiniciar);
        computadora.request();

        computadora.setState(apagado);
        computadora.request();

        computadora.setState(prendido);
        computadora.request();

        computadora.setState(reiniciar);
        computadora.request();
    }

}
