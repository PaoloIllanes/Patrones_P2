package strategy.exercise;

public class Ropa {
    private String clotheId;
    private String clotheType;
    private Integer clothePrice;
    private String season;

    public Ropa() {
    }

    public Ropa(String clotheId, String clotheType, Integer clothePrice, String season) {
        this.clotheId = clotheId;
        this.clotheType = clotheType;
        this.clothePrice = clothePrice;
        this.season = season;
    }

    public void showInfo(){
        System.out.println("-- ID        : " + clotheId);
        System.out.println("-- Tipo      : " + clotheType);
        System.out.println("-- Precio    : " + clothePrice + " Bs.");
    }

    public String getClothesID() {
        return clotheId;
    }

    public void setClothesID(String clo_id) {
        this.clotheId = clo_id;
    }

    public String getClothesType() {
        return clotheType;
    }

    public void setClothesType(String clo_type) {
        this.clotheType = clo_type;
    }

    public Integer getClothesPrice() {
        return clothePrice;
    }

    public void setClothesPrice(Integer clo_price) {
        this.clothePrice = clo_price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
