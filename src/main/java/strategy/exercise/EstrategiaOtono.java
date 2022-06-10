package strategy.exercise;

import java.util.List;

public class EstrategiaOtono implements IEstrategiaDeVentas {
    @Override
    public void vender(List<Ropa> clothesList) {
        System.out.println("****TEMPORADA DE OTOñO****");
        int cont =1;
        for(Ropa clothes : clothesList) {
            if(clothes.getSeason().toUpperCase().equals("OTONO")) {
                System.out.println("Ropa " + cont++);
                clothes.showInfo();
                System.out.println("-- Precio de   ");
                System.out.println("   temporada : " +  Math.round( (clothes.getClothesPrice() * 0.5)) + " Bs.");
            }
        }

    }
}
