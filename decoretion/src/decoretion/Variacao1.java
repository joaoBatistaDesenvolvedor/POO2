package decoretion;

public interface CartaoBase {
	
	String message();
}
package decoretion;

public class Variacao1 extends CardDecoration {

	public Variacao1(CartaoBase cardDecoration) {
		super(cardDecoration);
		
	}
	@Override
	public String message() {
		return (cardDecoration.message()+messagevariation1(cardDecoration));	
	}
	public String messagevariation1(CartaoBase card) {
		String message=" que deus te abençoe sempre";
		return message;
		
	}


}
