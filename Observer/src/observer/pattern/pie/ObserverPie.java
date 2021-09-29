package observer.pattern.pie;

/**
 * An interface for all Observers
 */
public interface ObserverPie {
	/**
	 * Informs this observer that an observed subject has changed
	 * 
	 * @param o
	 *            the observed subject that has changed
	 */
	public void update(ObservablePie o);
}