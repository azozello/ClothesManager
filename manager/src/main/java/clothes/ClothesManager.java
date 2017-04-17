package clothes;

import java.util.ArrayList;
import java.util.List;

/*
Simple class to search and collect all the clothes
 */
public class ClothesManager {

    /**
    all clothes in the app
     */
    private ArrayList<Clothes> allClothes = new ArrayList<Clothes>();

    public void addClothes(Clothes clothes){
        allClothes.add(clothes);
    }

    public void addClothes(List<Clothes> clothes){
        allClothes.addAll(clothes);
    }

    public void removeClothes(Clothes clothes){
        try {
            allClothes.remove(clothes);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
    returns clothes from allClothes by type
    uses reflection
     */
    public ArrayList<Clothes> findClothes(ClotheType clotheType){
        ArrayList<Clothes> tempList = new ArrayList<Clothes>();
        try {
            for (Clothes clothe : allClothes){
                if (clothe.getClass().getSimpleName().equals(ClotheType.HAT.toString())){
                    tempList.add(clothe);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return tempList;
    }

    public ArrayList<Clothes> findAll(){
        return allClothes;
    }
}
