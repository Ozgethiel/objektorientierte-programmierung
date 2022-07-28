package DataBase;

import java.io.IOException;
import java.util.List;

public interface DataStorage <T extends Entity>{


    void store(T entity);

    List<T> readAll();

    void fillEntity(Participant entity, String[] values);


    //void store(int getColumns);
}
