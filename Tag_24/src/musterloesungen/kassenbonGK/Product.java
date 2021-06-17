package musterloesungen.kassenbonGK;

public class Product {
	
		private  String productName;
		private  double productPrice;
		public static Product[] products = new Product[4]; 
		public Product(String productName, double productPrice) {
			this.setProductName(productName);
			this.setProductPrice(productPrice);
	}
		public Product() {
			
			products[0] = new Product("15 Fischstäbchen", 1.79);
			products[1] = new Product("Steaks", 3.99);
			products[2] = new Product("Naturelle (1l)", 4.99);
			products[3] = new Product("Magnum Eis Creme", 2.99);

}
		

		
		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
	}
