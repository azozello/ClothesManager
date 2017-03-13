package core;

import core.Clothes.*;

public class Main {
    public static void main(String[] args){
        /*
        Just for test, you can write here whatever you like
         */

        Clothes h = new Hat("black",2,"leather","summer");
        Footwear f = new Footwear("white",1,"l","s");
        Outewear o = new Outewear("s",1,"s","s");
        Suit s = new Suit("s",1,"s","s","s");

        Clothing_accessories ca = new Clothing_accessories("s",2,"s","s","s");
        ClothesManager.addClothes(h);
        ClothesManager.addClothes(f);
        ClothesManager.addClothes(o);
        ClothesManager.addClothes(s);
        ClothesManager.addClothes(ca);

        System.out.println(ClothesManager.findAll());
        System.out.println(ClothesManager.findClothes(ClotheType.CLOTHINGACCESSORIES));
        System.out.println(ClothesManager.findClothes(ClotheType.HAT));

        Hat h2 = (Hat) ClothesManager.findClothes(ClotheType.HAT).get(0);
        System.out.println("added: "+h);
        System.out.println("returned: "+h2);
    }
}
