package probePrufung.generics.Vererbung;

import java.util.ArrayList;

public class Aeki {

    public static void main(String[]args){

        Furniture[] furnitures = new Furniture[2];
        Furniture a = new Furniture(10,20,30);
        furnitures[0] = a;

        Carpet carpet = new Carpet(2,3);
        furnitures[1]= carpet;



    }
}
