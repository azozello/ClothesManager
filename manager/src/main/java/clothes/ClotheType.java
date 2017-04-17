package clothes;

/*
Simple enum for clothes
Use toString method to get simple class`s name of each type
 */

public enum ClotheType {

    CLOTHINGACCESSORIES("Clothing_accessories"),
    FOOTWEAR("Footwear"),
    HAT("Hat"),
    OUTWEAR("Outewear"),
    SUIT("Suit");

    private String text;

    private ClotheType(final String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
