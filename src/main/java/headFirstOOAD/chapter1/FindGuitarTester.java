package headFirstOOAD.chapter1;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[]args){
        Inventory inventory = new Inventory();

        intializeInvetory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER);
        //Guitar searchSerialNumber = new Guitar("V84", )

        List matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like these Guitars: ");
                    for (Iterator i = matchingGuitars.iterator(); i.hasNext();){
                        Guitar guitar = (Guitar) i.next();
                        GuitarSpec spec = guitar.getSpec();
                        System.out.println("  We have a " +
                            spec.getBuilder() + " " + spec.getModel() + " "+
                            spec.getNumStrings() + "-string " + spec.getType() + "guitar:\n  " +
                            spec.getBackWood() + " back and sides,\n  "+
                            spec.getTopWood() + " top.\n  You can have it for only $"+
                            guitar.getPrice() +"!\n -----");
            }
        } else {
            System.out.println("Sorry, Erin, We have nothing for you.");
        }
    }


    private static void intializeInvetory(Inventory inventory){
        inventory.addGuitar("V84", 1499, Builder.FENDER,"Stratocastor"
                , Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V82", 1540, Builder.FENDER, "Stratocastor"
                , Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
    }
}

