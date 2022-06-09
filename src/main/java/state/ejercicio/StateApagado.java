package state.ejercicio;

public class StateApagado implements IStateComputadora{

    @Override
    public void handler(Computadora computadora) {
        computadora.getProgramasAbiertos().clear();
        computadora.getCpu().setUsage(5);
        computadora.getRam().setUsage(5);
        System.out.println("Iniciando computadora....");
        System.out.println("Programas abiertos : "+ computadora.getProgramasAbiertos().size());
        System.out.println("Uso de CPU : " +computadora.getCpu().getUsage()+"%");
        System.out.println("Uso de Memoria RAM : "+computadora.getRam().getUsage()+"%");

    }

}
