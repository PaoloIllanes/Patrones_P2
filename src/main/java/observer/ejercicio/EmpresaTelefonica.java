package observer.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTelefonica implements ISubjectEmpresaTelefonica {
    private List<ICliente> observerList= new ArrayList<>();

    private List<NotificacionEmpresa> notf_List = new ArrayList<>();

    public void setNewNotify(NotificacionEmpresa notification){
        notf_List.add(notification);
        this.notifyObserver(notification);
    }

    @Override
    public void attach(ICliente observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(ICliente observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver(NotificacionEmpresa mssg) {
        for (ICliente client:observerList) {
            if (client.getClientSupscriptionToPrices() == mssg.isNotificationPrice() && client.getClientSupscriptionToPrices()) {
                // Notificacion de PRECIOS
                client.update("Se tiene el siguiente mensaje: "+ mssg.getNotificationTitle(), mssg);
            } else if (client.getClientSupscriptionToPromotions() == mssg.isNotificationPromotion() && client.getClientSupscriptionToPromotions()) {
                // Notificacion de PROMOCIONES
                client.update("Se tiene el siguiente mensaje: "+ mssg.getNotificationTitle(), mssg);
            } else if (client.getClientSupscriptionToGifts() == mssg.isNotificationGift() && client.getClientSupscriptionToGifts()) {
                // Notificacion de PREMIOS
                client.update("Se tiene el siguiente mensaje: "+ mssg.getNotificationTitle(), mssg);
            } else if (client.getClientSupscriptionToNews() == mssg.isNotificationNews() && client.getClientSupscriptionToNews()) {
                // Notificacion de NOTICIAS
                client.update("Se tiene el siguiente mensaje: "+ mssg.getNotificationTitle(), mssg);
            }
        }
    }
}