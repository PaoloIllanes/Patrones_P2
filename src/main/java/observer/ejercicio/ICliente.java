package observer.ejercicio;

public interface ICliente {
    void update(String message, NotificacionEmpresa video);
    String getClientCategory();
    boolean getClientSupscriptionToPrices();
    boolean getClientSupscriptionToPromotions();
    boolean getClientSupscriptionToGifts();
    boolean getClientSupscriptionToNews();
}
