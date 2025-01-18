
public class PersonalCard {
	int cardid;
	String cardname;
	
	public PersonalCard(int cardid, String cardname) {
		super();
		this.cardid = cardid;
		this.cardname = cardname;
	}

	public PersonalCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCardid() {
		return cardid;
	}

	public void setCardid(int cardid) {
		this.cardid = cardid;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	
	public void DiplayId() {
		
		
		System.out.println("Card ID:"+cardid);
		System.out.println("Cardname:"+cardname);
		
	}

	@Override
	public String toString() {
		return "PersonalCard [cardid=" + cardid + ", cardname=" + cardname + ", getCardid()=" + getCardid()
				+ ", getCardname()=" + getCardname() + "]";
	}
	
	

}
