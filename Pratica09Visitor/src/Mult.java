import java.util.List;

public class Mult implements NumberVisitor {
	@Override
	public void vist(TwoElement twoElement) {

		int soma = twoElement.a * twoElement.b;
		System.out.println("a  multiplicacao de " + twoElement.a + "*" + twoElement.b + "a multiplicação" + soma);
	}

	@Override
	public void vist(ThereeElement thereeElement) {
		int soma = thereeElement.a * thereeElement.b * thereeElement.c;
		System.out.println("a mult de " + thereeElement.a + "*" + thereeElement.b + thereeElement.c + "a mult" + soma);

	}

	@Override
	public void vist(List<NumberElement> elementList) {
		for (NumberElement ne : elementList) {
			ne.acept(this);

		}

	}

}