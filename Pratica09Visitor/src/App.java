import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		TwoElement twoElement1 = new TwoElement(3, 3);
		TwoElement twoElement2 = new TwoElement(2, 7);
		ThereeElement thereeElement = new ThereeElement(3, 4, 5);
		List<NumberElement> elements = new ArrayList<>();
		elements.add(twoElement1);
		elements.add(twoElement2);
		elements.add(thereeElement);
		System.out.println("visiting in list sumVisitor ");
		NumberVisitor numberVisitor = new SumVistor();
		NumberVisitor mult = new Mult();
		numberVisitor.vist(elements);
		mult.vist(elements);

		System.out.println("visiting in list TotalVisitor ");
		TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
		totalSumVisitor.vist(elements);
		System.out.println("total sum" + totalSumVisitor.getTotalsoma());
	}

}