package strategy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main (String []args) {
        TiendaDeRopa clothing_store = new TiendaDeRopa();
        clothing_store.setAdministrator("María Jose De La Riva");
        List<Ropa> clothes_list =  new ArrayList<>();
        clothes_list.add(new Ropa("01", "Suéter", 280, "Invierno"));
        clothes_list.add(new Ropa("07", "Gorro", 45, "Invierno"));
        clothes_list.add(new Ropa("10", "Abrigo", 450, "Invierno"));
        clothes_list.add(new Ropa("06", "Camiseta de Manga Corta", 108, "Verano"));
        clothes_list.add(new Ropa("20", "Pantalones Cortos", 85, "Verano"));
        clothes_list.add(new Ropa("13", "Camiseta de Manga Corta", 110, "Verano"));
        clothes_list.add(new Ropa("14", "Camiseta de Manga Corta", 120, "Primavera"));
        clothes_list.add(new Ropa("18", "Pantalón", 295, "Primavera"));
        clothes_list.add(new Ropa("22", "Gorra", 40, "Primavera"));
        clothes_list.add(new Ropa("07", "Suéter", 250, "Otono"));
        clothes_list.add(new Ropa("19", "Suéter", 280, "Otono"));
        clothes_list.add(new Ropa("34", "Pantalón", 300, "Otono"));

        clothing_store.setClothesList(clothes_list);
        //INVIERNO
        clothing_store.setSalesStrategy(new EstrategiaInvierno());
        clothing_store.venderConEstrategia();
        //VERANO
        clothing_store.setSalesStrategy(new EstrategiaVerano());
        clothing_store.venderConEstrategia();
        //PRIMAVERA
        clothing_store.setSalesStrategy(new EstrategiaPrimavera());
        clothing_store.venderConEstrategia();
        //OTOÑO
        clothing_store.setSalesStrategy(new EstrategiaOtono());
        clothing_store.venderConEstrategia();
    }
}
