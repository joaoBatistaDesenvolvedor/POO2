import java.util.List;

public interface NumberVisitor {
	public void vist(TwoElement twoElement);

	public void vist(ThereeElement threeElement);

	public void vist(List<NumberElement> elementList);

}
