package core.Clothes;

public class Clothing_accessories extends Clothes {

	String carried;
	String warm;
	public Clothing_accessories(String color,int size,String material,String carried,String warm){
	super(color,size,material);
	this.carried=carried;
	this.warm=warm;
	
	}
	@Override
	public String toString() {
		return "Clothing_accessories [carried=" + carried + ", warm=" + warm + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carried == null) ? 0 : carried.hashCode());
		result = prime * result + ((warm == null) ? 0 : warm.hashCode());
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
		Clothing_accessories other = (Clothing_accessories) obj;
		if (carried == null) {
			if (other.carried != null)
				return false;
		} else if (!carried.equals(other.carried))
			return false;
		if (warm == null) {
			if (other.warm != null)
				return false;
		} else if (!warm.equals(other.warm))
			return false;
		return true;
	}

}
