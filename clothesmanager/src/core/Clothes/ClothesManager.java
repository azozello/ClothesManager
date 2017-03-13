package core.Clothes;

import java.util.ArrayList;
import java.util.List;

/*
Simple class to search and collect all the clothes
 */
public abstract class ClothesManager {

    /*
    all clothes in the app
     */
    private static ArrayList<Clothes> allClothes = new ArrayList<>();

    public static void addClothes(Clothes clothes){
        allClothes.add(clothes);
    }

    public static void addClothes(List<Clothes> clothes){
        allClothes.addAll(clothes);
    }

    public static void removeClothes(Clothes clothes){
        try {
            allClothes.remove(clothes);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
    returns clothes from allClothes by type
    uses reflection
     */
    public static ArrayList<Clothes> findClothes(ClotheType clotheType){
        ArrayList<Clothes> tempList = new ArrayList<>();
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

    public static ArrayList<Clothes> findAll(){
        return allClothes;
    }
}
