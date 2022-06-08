package observer.ejercicio;

public class Client {
    public static void main (String []args){
        EmpresaTelefonica viva = new EmpresaTelefonica();

        //GUIA: Precios, Promociones, Premios, Noticias
        ClientePersona user1= new ClientePersona(new Persona("5495425 LP","Sonia Aranibar"),"PRECIOS", true, false, false, false);
        ClientePersona user2= new ClientePersona(new Persona("8593364 OR","Patrick Gutierrez"),"PROMOCIONES Y NOTICIAS", false, true, false, true);
        ClientePersona user3= new ClientePersona(new Persona("14525622 SC","Vladimir Gómez"),"PREMIOS", false, false, true, false);
        ClientePersona user4= new ClientePersona(new Persona("7432425 LP","Pablo Ibarra"),"++TODOS++", true, true, true, true);
        ClientePersona user5= new ClientePersona(new Persona("8342555 TJ","Rodrigo Entrambasaguas"),"NOTICIAS", false, false, false, true);
        viva.attach(user1);
        viva.attach(user2);
        viva.attach(user3);
        viva.attach(user4);
        viva.attach(user5);

        viva.setNewNotify(new NotificacionEmpresa("PRECIOS","Precio del Dispositivo Móvil Samsung S21 : 1100 $us ",  true, false, false, false));
        System.out.println();
        viva.setNewNotify(new NotificacionEmpresa("PROMOCIONES","Descuentos de VERANO!!!!!", false, true, false, false));
        System.out.println();
        viva.setNewNotify(new NotificacionEmpresa("PREMIOS","Gana un IPhone 11",  false, false, true, false));
        System.out.println();
        viva.setNewNotify(new NotificacionEmpresa("NOTICIAS","Nuevos Paquetes Disponibles",  false, false, false, true));
    }
}
