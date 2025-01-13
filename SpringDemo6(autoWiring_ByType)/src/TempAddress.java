
public class TempAddress {
	String city;
	String state;
	
	public TempAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public TempAddress() {
		super();

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
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
