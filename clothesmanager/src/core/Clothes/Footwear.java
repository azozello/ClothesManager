package core.Clothes;

public class Footwear extends Clothes {
String impermeability;

public Footwear(String color,int size,String material,String impermeability){
	super(color,size,material);
	this.impermeability=impermeability;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((impermeability == null) ? 0 : impermeability.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Footwear other = (Footwear) obj;
	if (impermeability == null) {
		if (other.impermeability != null)
			return false;
	} else if (!impermeability.equals(other.impermeability))
		return false;
	return true;
}

@Override
public String toString() {
	return "Footwear [impermeability=" + impermeability + "]";
}
}
