package DataBase;

public class DatabaseMain {

    public static void main(String[] args) {
        ParticipantCsvDataStorage participantStorage = new ParticipantCsvDataStorage("participants.csv");

        System.out.println(participantStorage.readAll());
        Participant Ozge = new Participant();
        Participant Leo= new Participant();
        Participant Timo= new Participant();
        Participant Lukas = new Participant();
        Leo.setFirstname("Leo");
        Leo.setLastname("Thiel");
        Timo.setFirstname("Timo");
        Timo.setLastname("Thiel");
        Lukas.setFirstname("Lukas");
        Lukas.setLastname("Thiel");
        Ozge.setFirstname("Ozge");
        Ozge.setLastname("Thiel");

        Ozge.setId(1);
        Leo.setId(2);
        Timo.setId(3);
        Lukas.setId(4);
        participantStorage.store(Leo);
        participantStorage.store(Ozge);
        participantStorage.store(Timo);
        participantStorage.store(Lukas);

    }
}
