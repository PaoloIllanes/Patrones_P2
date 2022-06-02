package mediator.exercise;


import java.util.HashMap;

public class Skype implements ICanalDeComunicacion {
    private HashMap<String, ScrumMember> personasChat= new HashMap<>();

    public void addPersonasAlChat(ScrumMember scrumMember){
        personasChat.put(scrumMember.getCi(), scrumMember);
    }

    @Override
    public void send(String message, Colleague personaOrigen) {
        ScrumMember scrumMemberParseOrigen = (ScrumMember) personaOrigen;

        for (HashMap.Entry<String, ScrumMember> persona : personasChat.entrySet()) {
            if ( !scrumMemberParseOrigen.getCi().equals(persona.getValue().getCi())){
                if (scrumMemberParseOrigen.getCargo().equals("SM")){
                    persona.getValue().messageReceived(message);
                }
                if (scrumMemberParseOrigen.getCargo().equals("QA") && persona.getValue().getCargo().equals("QA")){
                    persona.getValue().messageReceived(message);
                }
                if (scrumMemberParseOrigen.getCargo().equals("DEV") && persona.getValue().getCargo().equals("DEV")){
                    persona.getValue().messageReceived(message);
                }
            }
        }


    }

}
