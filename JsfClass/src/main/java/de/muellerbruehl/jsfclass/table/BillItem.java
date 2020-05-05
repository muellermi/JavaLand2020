package de.muellerbruehl.jsfclass.table;

public class BillItem {
	public BillItem (Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}
	public BillItem() {}
	
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal(){
		return amount * product.getPrice();
	}
}
