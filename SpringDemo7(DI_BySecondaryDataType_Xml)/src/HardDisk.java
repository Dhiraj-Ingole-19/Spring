
public class HardDisk {
	
	String size;

	public HardDisk(String size) {
		super();
		this.size = size;
	}

	public HardDisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "HardDisk [size=" + size + "]";
	}
	

}
