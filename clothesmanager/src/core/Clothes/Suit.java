package core.Clothes;

public class Suit extends Clothes {

	String opened;
	String closed;
	
	public Suit(String color,int size,String material,String opened,String closed){
		super(color,size,material);
		this.opened=opened;
		this.closed=closed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((closed == null) ? 0 : closed.hashCode());
		result = prime * result + ((opened == null) ? 0 : opened.hashCode());
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
		Suit other = (Suit) obj;
		if (closed == null) {
			if (other.closed != null)
				return false;
		} else if (!closed.equals(other.closed))
			return false;
		if (opened == null) {
			if (other.opened != null)
				return false;
		} else if (!opened.equals(other.opened))
			return false;
		return true;
	}
}
