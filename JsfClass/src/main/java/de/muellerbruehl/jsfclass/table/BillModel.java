package de.muellerbruehl.jsfclass.table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BillModel {
	private String customer;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	private List<BillItem> billItems = new ArrayList<>();

	public List<BillItem> getBillItems() {
		return Collections.unmodifiableList(billItems);
	}

	public void addItem() {
		billItems.add(new BillItem(Product.None, 0));
	}

	public void addItem(BillItem item) {
		billItems.add(item);
	}

	public void removeItem(BillItem item) {
		billItems.remove(item);
	}

}
