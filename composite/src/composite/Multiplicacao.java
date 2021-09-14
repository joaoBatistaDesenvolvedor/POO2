package composite;

public class Multiplicacao extends ExpressaoAritimetica {
	private ExpressaoAritimeticpackage composite;

public class Multiplicacao extends ExpressaoAritimetica {
	private ExpressaoAritimetica op1,op2;
	
	public Multiplicacao(ExpressaoAritimetica op1, ExpressaoAritimetica op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}
	@Override
	
	public int getResultado() {
		// TODO Auto-generated method stub
		return this.op1.getResultado()*this.op2.getResultado();
	}
}
