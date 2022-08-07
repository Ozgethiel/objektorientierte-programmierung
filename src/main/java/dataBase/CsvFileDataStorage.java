package dataBase;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class CsvFileDataStorage<T extends Entity> implements DataStorage<T> {

    private final String fileName;
    private File file;

    public CsvFileDataStorage(String fileName) {
        this.fileName = fileName;
        file = new File(fileName);
        try {
            boolean fileAlreadyExists = file.createNewFile();
            if (fileAlreadyExists) {
                System.out.println("File already exists: " + file);
            } else {
                System.out.println("File created: " + file);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    protected List<String> getColumns(T entity) {
        List<String> list = new ArrayList<>();
        String ab = String.valueOf(entity.getId());
        list.add(ab);
        return list;

    }


    protected abstract T createEntity();

    protected void fillEntity(T entity, String[] values) {
    entity.setId(Integer.parseInt(values[0]));
    }

    @Override
    public void store(T entity) {
        List<String> columns = getColumns(entity);
        String line = "";
        for (String column : columns) {
            line = line + column + ", ";
        }


        try (OutputStream outputStream = new FileOutputStream(file, true);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            bufferedWriter.append(line);
            bufferedWriter.newLine();
        } catch (IOException e){
            throw new RuntimeException("Konnte nicht die Datei schreiben");
        }

    }

    @Override
    public List<T> readAll() {

        List<T> list = new ArrayList<>();
        try {

            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = bufferedReader.readLine();
           // while((line = bufferedReader.readline())!=null){

            if (line == null) {
                System.out.println("File is empty");
                return list;
            }

            String [] values= line.split(", ");
            T entity = createEntity();
            fillEntity(entity, values);

            List<T> entities= new ArrayList<>();
            entities.add(entity);
            return entities;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}