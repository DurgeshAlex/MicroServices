package kumar.durgesh.order.dto;

public class Order {
private static long orderId;
private String itemName;
private String vegOrNoneg;
private int orderCount;

public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getVegOrNoneg() {
	return vegOrNoneg;
}
public void setVegOrNoneg(String vegOrNoneg) {
	this.vegOrNoneg = vegOrNoneg;
}
public int getOrderCount() {
	return orderCount;
}
public void setOrderCount(int orderCount) {
	this.orderCount = orderCount;
}
public Order(String itemName, String vegOrNoneg, int orderCount) {
	super();
	this.orderId = this.orderId++;
	this.itemName = itemName;
	this.vegOrNoneg = vegOrNoneg;
	this.orderCount = orderCount;
}

}
