
public class ThereeElement implements NumberElement {
	int a, b, c;

	public ThereeElement(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;

	}

	@Override
	public void acept(NumberVisitor visitor) {
		visitor.vist(this);
	}

}