public class Q2{
	public static void main(String[] args){
		CashCard cc = new CashCard("s001", 20.0);
		System.out.println(cc.getValue());
		cc.topUp(10);
		System.out.println(cc.getValue());
		if (cc.deduct(40)){
		System.out.println("successful deduction");
		}else{
			System.out.println("money no enough, lah");
		}
	}		
}