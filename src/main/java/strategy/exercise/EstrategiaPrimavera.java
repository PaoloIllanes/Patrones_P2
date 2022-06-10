package strategy.exercise;

import java.util.List;

public class EstrategiaPrimavera implements IEstrategiaDeVentas {
    @Override
    public void vender(List<Ropa> clothesList) {
        System.out.println("****TEMPORADA DE PRIMAVERA****");
        int cont = 1;
        for(Ropa clothes : clothesList) {
            if(clothes.getSeason().toUpperCase().equals("PRIMAVERA")) {
                System.out.println("Ropa " + cont++);
                clothes.showInfo();
                System.out.println("-- Precio de   ");
                System.out.println("   temporada : " + (clothes.getClothesPrice()) + " Bs.");
            }
        }

    }
}
