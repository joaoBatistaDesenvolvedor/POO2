package decoretion;

public class Variacao2 extends CardDecoration {

	public Variacao2(CartaoBase cardDecoration) {
		super(cardDecoration);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String message() {
		return (cardDecoration.message()+messagevariation2(cardDecoration));	
	}
	public String messagevariation2(CartaoBase card) {
		String message=" muito sucesso";
		returnpackage decoretion;

public class Variacao2 extends CardDecoration {

	public Variacao2(CartaoBase cardDecoration) {
		super(cardDecoration);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String message() {
		return (cardDecoration.message()+messagevariation2(cardDecoration));	
	}
	public String messagevariation2(CartaoBase card) {
		String message=" muito sucesso";
		return message;
		
	}

}
