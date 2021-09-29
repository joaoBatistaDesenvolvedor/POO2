package observer.pattern.pie;

import java.util.Vector;

/**
 * An abstract class for all Observable subjects
 */
public abstract class ObservablePie {
	/**
	 * Constructs an Observable object
	 */
	public ObservablePie() {
		this.observers = new Vector<ObserverPie>();
	}

	/**
	 * Attach to this Subject
	 * 
	 * @param o
	 *            the Observer that wishes to attach
	 */
	public void attach(ObserverPie o) {
		this.observers.addElement(o);
	}

	/**
	 * Detach from this Subject
	 * 
	 * @param o
	 *            the Observer that wishes to detach
	 */
	public void detach(ObserverPie o) {
		for (int i = 0; i < observers.size(); i++) {
			if (observers.elementAt(i).equals(o))
				observers.removeElementAt(i);
		}
	}

	/**
	 * Notify all Observers that Subject has changed
	 */
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			ObserverPie observer = observers.elementAt(i);
			observer.update(this);
		}
	}

	/**
	 * Pull updated data from this Subject
	 * 
	 * @return the updated data from the Subject
	 */
	public abstract Object getUpdate();

	protected Vector<ObserverPie> observers;
}