package mediator.exercise;


public class Client {

    public static void main (String[] args){
        Skype skype= new Skype();

        ScrumMember dev1 = new ScrumMember(skype);
        ScrumMember dev2 = new ScrumMember(skype);
        ScrumMember dev3 = new ScrumMember(skype);
        ScrumMember qa1 = new ScrumMember(skype);
        ScrumMember qa3 = new ScrumMember(skype);
        ScrumMember qa2 = new ScrumMember(skype);
        ScrumMember sm1 = new ScrumMember(skype);
        ScrumMember sm2 = new ScrumMember(skype);
        ScrumMember sm3 = new ScrumMember(skype);


        dev1.setCargo("DEV");
        dev1.setName("dev1");
        dev1.setCi("111");
        dev1.setEspecialidad("Lenguaje: Java");
        dev2.setCargo("DEV");
        dev2.setName("dev2");
        dev2.setCi("1112");
        dev2.setEspecialidad("Lenguaje: Python");
        dev3.setCargo("DEV");
        dev3.setName("dev3");
        dev3.setCi("43435");
        dev3.setEspecialidad("Lenguaje: Kotlin");
        qa1.setCargo("QA");
        qa1.setName("qa1");
        qa1.setCi("43243");
        qa1.setEspecialidad("Grado: Senior");
        qa2.setCargo("QA");
        qa2.setName("qa2");
        qa2.setEspecialidad("Grado: Junior");
        qa2.setCi("111533");
        qa3.setCargo("QA");
        qa3.setName("qa3");
        qa3.setEspecialidad("Grado: Senior");
        qa3.setCi("98798");
        sm1.setCargo("SM");
        sm1.setName("sm1");
        sm1.setCi("987989");
        sm1.setEspecialidad("Certificaciones: Java, UX");
        sm2.setCargo("SM");
        sm2.setName("sm2;");
        sm2.setCi("789999");
        sm2.setEspecialidad("Certificaciones: Python, Agile");
        sm3.setCargo("SM");
        sm3.setName("sm3");
        sm3.setCi("7898989");
        sm3.setEspecialidad("Certificaciones: Scala, UX");

        skype.addPersonasAlChat(dev1);
        skype.addPersonasAlChat(dev2);
        skype.addPersonasAlChat(dev3);
        skype.addPersonasAlChat(qa1);
        skype.addPersonasAlChat(qa2);
        skype.addPersonasAlChat(qa3);
        skype.addPersonasAlChat(sm1);
        skype.addPersonasAlChat(sm2);
        skype.addPersonasAlChat(sm3);

        dev1.send("hola como estan todos los DEVs");
        dev2.send("todo bien DEVs");
        qa2.send("hola a todos los QAs");
        sm1.send("hola a todos!! hoy acaba el sprint");

    }

}
