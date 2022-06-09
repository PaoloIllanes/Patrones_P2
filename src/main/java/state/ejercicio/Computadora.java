package state.ejercicio;


import java.util.ArrayList;

public class Computadora {

    private IStateComputadora state;
    private CPU cpu;
    private MemoriaRAM ram;
    private ArrayList<String> programasAbiertos;



    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public void request(){
        this.state.handler(this);
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MemoriaRAM getRam() {
        return ram;
    }

    public void setRam(MemoriaRAM ram) {
        this.ram = ram;
    }

    public ArrayList<String> getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ArrayList<String> programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }
}
