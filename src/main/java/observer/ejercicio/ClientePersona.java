package observer.ejercicio;

public class ClientePersona implements ICliente {
    private String clnt_category;
    private Persona clnt_person;
    private boolean clnt_ntf_prices;
    private boolean clnt_ntf_promotions;
    private boolean clnt_ntf_gifts;
    private boolean clnt_ntf_news;

    public ClientePersona(Persona persona, String categoria, boolean ntf_precios, boolean ntf_promociones, boolean ntf_premios, boolean ntf_noticias) {
        this.clnt_person = persona;
        this.clnt_category = categoria;
        this.clnt_ntf_prices = ntf_precios;
        this.clnt_ntf_promotions = ntf_promociones;
        this.clnt_ntf_gifts = ntf_premios;
        this.clnt_ntf_news = ntf_noticias;
    }

    @Override
    public void update(String message, NotificacionEmpresa ntf) {
        System.out.println("********* NOTIFICACIONES " + clnt_category + " *********");
        System.out.println(message);
        clnt_person.showInfo();
        ntf.showInfo();
        System.out.println("\n******************************************\n");
    }

    @Override
    public String getClientCategory() {
        return this.clnt_category;
    }

    @Override
    public boolean getClientSupscriptionToPrices() {
        return clnt_ntf_prices;
    }

    @Override
    public boolean getClientSupscriptionToPromotions() {
        return clnt_ntf_promotions;
    }

    @Override
    public boolean getClientSupscriptionToGifts() {
        return clnt_ntf_gifts;
    }

    @Override
    public boolean getClientSupscriptionToNews() {
        return clnt_ntf_news;
    }
}
