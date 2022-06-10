package strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeRopa {
    private IEstrategiaDeVentas salesStrategy;
    private List<Ropa> clothesList = new ArrayList<>();
    private String administrator;

    public TiendaDeRopa() {
    }

    public void venderConEstrategia() {
        salesStrategy.vender(this.clothesList);
    }

    public IEstrategiaDeVentas getSalesStrategy() {
        return salesStrategy;
    }

    public void setSalesStrategy(IEstrategiaDeVentas sales_strategy) {
        this.salesStrategy = sales_strategy;
    }

    public List<Ropa> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<Ropa> clothes_list) {
        this.clothesList = clothes_list;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }
}
