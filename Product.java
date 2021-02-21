package homework2;
import java.io.*;

public final class Product {

	public String productName;
	public String productDescription;
	public Double price;
	public int maxQuantity;
	/**
	 * Constructor for Product Class
	 * @param productName
	 * @param productDescription
	 * @param price
	 * @param maxQuantity
	 */
	public Product(String productName, String productDescription, Double price,int maxQuantity) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.maxQuantity = maxQuantity;

	}
	/**
	 * Gets the product name
	 * @return
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * Sets the product name
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * Gets the product description
	 * @return
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * Sets the product description
	 * @param productDescription
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	/**
	 * Returns the price 
	 * @return
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * Sets the price
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * Returns max quantity
	 * @return
	 */
	public int getMaxQuantity() {
		return maxQuantity;
	}
	/**
	 * Sets max quantity
	 * @param maxQuantity
	 */
	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	@Override
	public String toString() {
		return "Product: productName=" + productName + ", productDescription=" + productDescription + ", price=" + price
				+ ", maxQuantity=" + maxQuantity + "]";
	}



}
