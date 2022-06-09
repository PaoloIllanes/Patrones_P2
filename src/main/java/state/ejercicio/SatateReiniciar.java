package state.ejercicio;

public class SatateReiniciar implements IStateComputadora{

    @Override
    public void handler(Computadora computadora) {
        System.out.println("Reiniciando computadora....");
        System.out.println("Cerrando todos los programas....");
        computadora.getProgramasAbiertos().clear();
        computadora.getCpu().setUsage(0);
        computadora.getRam().setUsage(0);
        System.out.println("Programas abiertos : "+ computadora.getProgramasAbiertos().size());
        System.out.println("Uso de CPU : " +computadora.getCpu().getUsage()+"%");
        System.out.println("Uso de Memoria RAM : "+computadora.getRam().getUsage()+"%");

    }


}
