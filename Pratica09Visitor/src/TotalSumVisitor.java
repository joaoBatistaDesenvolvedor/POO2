import java.util.List;

public class TotalSumVisitor implements NumberVisitor {
	int totalsoma = 0;

	@Override
	public void vist(TwoElement twoElement) {

		int soma = twoElement.a + twoElement.b;
		System.out.println("a soma de " + twoElement.a + "+" + twoElement.b + "a soma" + soma);
		totalsoma += soma;
	}

	@Override
	public void vist(ThereeElement thereeElement) {
		int soma = thereeElement.a + thereeElement.b + thereeElement.c;
		System.out.println("a soma de " + thereeElement.a + "+" + thereeElement.b + thereeElement.c + "a sopma" + soma);
		totalsoma += soma;

	}

	@Override
	public void vist(List<NumberElement> elementList) {
		for (NumberElement ne : elementList) {
			ne.acept(this);

		}

	}

	public int getTotalsoma() {
		return totalsoma;
	}

}
