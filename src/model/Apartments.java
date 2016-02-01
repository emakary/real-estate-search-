package model;

/*
Ehab Makary 

*/
public class Apartments {
	private String address;
	private String city;
	private String state;
	private int zip;
	private int price;
	private int numBed;
	private int numBath;
	private String lister;
	private String pic= null;
	
	
	
	
	public Apartments(String address, String city, String state, int zip, int price, int numBed, int numBath,
			String lister, String pic) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.price = price;
		this.numBed = numBed;
		this.numBath = numBath;
		this.lister = lister;
		this.pic = null;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getNumBed() {
		return numBed;
	}
	public void setNumBed(int numBed) {
		this.numBed = numBed;
	}
	
	
	public int getNumBath() {
		return numBath;
	}
	public void setNumBath(int numBath) {
		this.numBath = numBath;
	}
	
	
	public String getLister() {
		return lister;
	}
	public void setLister(String lister) {
		this.lister = lister;
	}
	
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

	
	

}
