package de.muellerbruehl.jsfclass.table;

public enum Product {
	None(0, "", 0),
	Milk(1, "Frischmilch", 1),
	Cheese(2, "Französicher Weichkäse", 5),
	Bred(3, "Deutsches Brot", 3),
	Coffee(4, "Peruanischer Kaffee", 8);

	private Product(int number, String description, int price) {
		this.number = number;
		this.description = description;
		this.price = price;
	}

	private int number;

	public int getNumber() {
		return number;
	}

	private String description;

	public String getDescription() {
		return description;
	}

	private int price;

	public int getPrice() {
		return price;
	}

}
