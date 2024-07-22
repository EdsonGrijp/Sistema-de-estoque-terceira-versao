package entites;

public class Product {
	
	public String name; //n�o esquecer da regra do camel case.
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	

	public double totalValueInStock() {
		return  price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //palavra reservada de auto refer�ncia para o objeto. Ele est� acessando o atributo da classe.
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)			
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", totalValueInStock());
			
	}
}
