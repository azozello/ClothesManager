import clothes.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;

public class ClothesManagerTest {

    @Test
    public void addClothesSingleTest(){
        ClothesManager cm = new ClothesManager();
        Hat hat = new Hat("s",1,"s","s");

        cm.addClothes(hat);
        assertTrue(cm.findAll().contains(hat));
    }

    @Test
    public void addClothesListTest(){
        ClothesManager cm = new ClothesManager();
        Hat hat = new Hat("s",1,"s","s");
        List<Clothes> clothesList = new ArrayList<Clothes>();

        clothesList.add(hat);
        cm.addClothes(clothesList);

        assertTrue(cm.findAll().contains(hat));
    }

    @Test
    public void removeClothesTest(){
        ClothesManager cm = new ClothesManager();
        Hat hat = new Hat("s",1,"s","s");

        cm.addClothes(hat);
        cm.removeClothes(hat);

        assertFalse(cm.findAll().contains(hat));
    }

    @Test
    public void findClothesTest(){
        ClothesManager cm = new ClothesManager();
        Hat hat = new Hat("s",1,"s","s");
        cm.addClothes(hat);
        assertEquals(hat,cm.findClothes(ClotheType.HAT).get(0));
    }

    @Test
    public void findAllClothesTest(){
        ClothesManager cm = new ClothesManager();
        ArrayList<Clothes> testList = new ArrayList<Clothes>();
        Hat hat = new Hat("s",1,"s","s");

        cm.addClothes(hat);
        testList.add(hat);

        assertEquals(testList,cm.findAll());
    }
}
