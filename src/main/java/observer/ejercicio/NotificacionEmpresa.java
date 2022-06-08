package observer.ejercicio;

public class NotificacionEmpresa {
    private String ntf_category;
    private String ntf_title;
    private boolean ntf_price;
    private boolean ntf_promotion;
    private boolean ntf_gift;
    private boolean ntf_news;

    public NotificacionEmpresa(String ntf_category, String ntf_title, boolean ntf_price, boolean ntf_promotion, boolean ntf_gift, boolean ntf_news) {
        this.ntf_category = ntf_category;
        this.ntf_title = ntf_title;
        this.ntf_price = ntf_price;
        this.ntf_promotion = ntf_promotion;
        this.ntf_gift = ntf_gift;
        this.ntf_news = ntf_news;
    }

    public void showInfo(){
        System.out.println("> INFORMACION NOTIFICACIÓN: ");
        System.out.println(">> Titulo    : " + ntf_title);
        System.out.println(">> Categoria : ["+ ntf_category +"]");
    }

    public String getNotificationCategory() {
        return ntf_category;
    }

    public void setNotificationCategory(String ntf_category) {
        this.ntf_category = ntf_category;
    }

    public String getNotificationTitle() {
        return ntf_title;
    }

    public void setNotificationTitle(String ntf_title) {
        this.ntf_title = ntf_title;
    }

    public boolean isNotificationPrice() {
        return ntf_price;
    }

    public void setNotificationPrice(boolean ntf_price) {
        this.ntf_price = ntf_price;
    }

    public boolean isNotificationPromotion() {
        return ntf_promotion;
    }

    public void setNotificationPromotion(boolean ntf_promotion) {
        this.ntf_promotion = ntf_promotion;
    }

    public boolean isNotificationGift() {
        return ntf_gift;
    }

    public void setNotificationGift(boolean ntf_gift) {
        this.ntf_gift = ntf_gift;
    }

    public boolean isNotificationNews() {
        return ntf_news;
    }

    public void setNotificationNews(boolean ntf_news) {
        this.ntf_news = ntf_news;
    }
}
