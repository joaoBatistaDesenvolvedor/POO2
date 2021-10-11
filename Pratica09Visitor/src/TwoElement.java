
public class TwoElement implements NumberElement {

	int a, b;

	public TwoElement(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void acept(NumberVisitor visitor) {
		visitor.vist(this);
	}

}