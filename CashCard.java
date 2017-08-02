import javax.swing.JOptionPane;
public class CashCard{
	private String id;
	private double value;
	public CashCard (String id, double amt){
		this.id = id; //this is to resolve ambiguity
		value = amt;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String newid){
		id = newid;
	}
	
	public double getValue(){
		return value;
	}
	
	public void topUp(double amt){
		value = value+amt;
	}
	
	public boolean deduct(double amt){
	if (amt <= value){
		value = value-amt;
		return true;
	}
	 else {
		JOptionPane.showMessageDialog(null,"Out of Money :-(");
		return false;
	}
	}
}

	