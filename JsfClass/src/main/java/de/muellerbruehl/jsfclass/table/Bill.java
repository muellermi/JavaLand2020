package de.muellerbruehl.jsfclass.table;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SessionScoped
@Named
public class Bill implements Serializable {
    // https://pastebin.com/M9n1ikBp
    private static final long serialVersionUID = 1L;
    private final BillModel bill;

    public Bill() {
        // create bill for demonstration - in a real app we would retrieve it from db by id
        bill = new BillModel();
        bill.setCustomer("Lieschen Müller");
        bill.addItem();
    }

    private Product product;
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCustomer() {
        return bill.getCustomer();
    }

    public void setCustomer(String customer) {
        bill.setCustomer(customer);
    }

    public List<BillItem> getBillItems() {
        return bill.getBillItems();
    }

    public void addItem() {
        bill.addItem();
    }

    public void removeItem(BillItem item) {
        bill.removeItem(item);
    }

    public List<SelectItem> productItems(BillItem item) {
        Set<Product> usedProducts = getBillItems()
                .stream()
                .map(bi -> bi.getProduct())
                .filter(p -> p != item.getProduct())
                .collect(Collectors.toSet());
        return Arrays.stream(Product.values())
                .filter(p -> p != Product.None)
                .filter(p -> !usedProducts.contains(p))
                .map(p -> new SelectItem(p, p.getDescription()))
                .collect(Collectors.toList());
    }
}
