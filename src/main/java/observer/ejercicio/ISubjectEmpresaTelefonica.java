package observer.ejercicio;

public interface ISubjectEmpresaTelefonica {
    void attach(ICliente observer);
    void deattach(ICliente observer);
    void notifyObserver(NotificacionEmpresa mssg);
}

