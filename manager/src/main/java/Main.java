import clothes.*;

public class Main {
    public static void main(String[] args){

        ClothesManager clothesManager = new ClothesManager();
        /*
        Just for test, you can write here whatever you like
         */
        Clothes h = new Hat("black",2,"leather","summer");
        Footwear f = new Footwear("white",1,"l","s");
        Outewear o = new Outewear("s",1,"s","s");
        Suit s = new Suit("s",1,"s","s","s");
        Clothing_accessories ca = new Clothing_accessories("s",2,"s","s","s");

        clothesManager.addClothes(h);
        clothesManager.addClothes(f);
        clothesManager.addClothes(o);
        clothesManager.addClothes(s);
        clothesManager.addClothes(ca);

        System.out.println(clothesManager.findAll());
        System.out.println(clothesManager.findClothes(ClotheType.CLOTHINGACCESSORIES));
        System.out.println(clothesManager.findClothes(ClotheType.HAT));

        Hat h2 = (Hat) clothesManager.findClothes(ClotheType.HAT).get(0);
        System.out.println("added: "+h);
        System.out.println("returned: "+h2);
    }
}
