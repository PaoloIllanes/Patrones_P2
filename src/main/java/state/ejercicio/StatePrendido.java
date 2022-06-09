package state.ejercicio;

public class StatePrendido implements IStateComputadora{


    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void handler(Computadora computadora) {

        int nProgramas = getRandomNumber(1,20);
        int ramUsage;
        int cpuUsage;
        for(int i =0;i<nProgramas;i++){
            computadora.getProgramasAbiertos().add("Programa"+String.valueOf(i));
        }
        ramUsage = computadora.getProgramasAbiertos().size()*5;
        cpuUsage = computadora.getProgramasAbiertos().size()*5;
        computadora.getRam().setUsage(ramUsage);
        computadora.getCpu().setUsage(cpuUsage);
        System.out.println("Computadora prendida....");
        System.out.println("Programas abiertos : "+ computadora.getProgramasAbiertos().size());
        System.out.println("Uso de CPU : " +computadora.getCpu().getUsage()+"%");
        System.out.println("Uso de Memoria RAM : "+computadora.getRam().getUsage()+"%");




}
}

