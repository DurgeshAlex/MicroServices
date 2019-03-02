package kumar.durgesh.customer.dto;

public class Customer {
	public String name;
	public long mobileNo;
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
	
}
