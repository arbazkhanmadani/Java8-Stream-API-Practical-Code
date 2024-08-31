package in.dsa.zstream.streams.objects;



public record  Product(int id, float price, String name, String type) {

	

	/*public Product(int id, float price, String name, String type) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", type=" + type + "]";
	}
	 */


	
	
}
