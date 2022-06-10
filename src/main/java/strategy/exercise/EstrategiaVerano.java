package strategy.exercise;

import java.util.List;

public class EstrategiaVerano implements IEstrategiaDeVentas {
    @Override
    public void vender(List<Ropa> clothesList) {
        System.out.println("****TEMPORADA DE VERANO****");
        int cont = 1;
        for(Ropa clothes : clothesList) {
            if(clothes.getSeason().toUpperCase().equals("VERANO")) {
                System.out.println("Ropa "+ cont++);
                clothes.showInfo();
                System.out.println("-- Precio de   ");
                System.out.println("   temporada : " +  Math.round( (clothes.getClothesPrice() * 0.9)*100.0)/100.0 + " Bs.\n");
            }
        }

    }
}
