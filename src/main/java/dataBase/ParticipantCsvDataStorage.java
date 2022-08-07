package dataBase;

import java.util.List;

public class ParticipantCsvDataStorage extends CsvFileDataStorage<Participant> {
    public ParticipantCsvDataStorage(String fileName) {
        super(fileName);
    }

    @Override
    protected List<String> getColumns(Participant name) {

        List<String> list = super.getColumns(name);
        list.add(name.lastname);
        list.add(name.firstname);
        return list;

    }

    @Override
    protected Participant createEntity() {
        return new Participant();


    }

    @Override
    public void fillEntity(Participant entity, String[] values) {
        super.fillEntity(entity, values);
        entity.setFirstname(values [1]);
        entity.setLastname(values [2]);


    }
}