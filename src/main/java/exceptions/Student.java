package exceptions;

public class Student {

    public static Student find(String id) throws StudentException {
        if (id.equals("124")) {
            return new Student();
        } else {
            throw new StudentException("Ögrenci bulunamadi");
        }
    }
}
