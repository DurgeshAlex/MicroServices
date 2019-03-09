package kumar.durgesh.customer.dto;

import java.util.List;

public class Customer {
	private String name;
	private long mobileNo;
	private List<Order> orders;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Customer(String name, long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (mobileNo ^ (mobileNo >>> 32));
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
		Customer other = (Customer) obj;
		if (mobileNo != other.mobileNo)
			return false;
		return true;
	}
	
}
