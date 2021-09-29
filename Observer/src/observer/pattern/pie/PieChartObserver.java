package observer.pattern.pie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JSlider;

import observer.CourseRecord;
import observer.LayoutConstants;

/**
 * This class represents a bar chart view of a vector of data. Uses the Observer
 * pattern.
 */
@SuppressWarnings("serial")
public class PieChartObserver extends JPanel implements ObserverPie {
	/**
	 * Creates a BarChartObserver object
	 * 
	 * @param data
	 *            a CourseData object to observe
	 */
	public PieChartObserver(CoursePieData data) {
		data.attach(this);
		this.courseData = data.getUpdate();
		this.setPreferredSize(new Dimension(2 * LayoutConstants.xOffset
				+ (LayoutConstants.barSpacing + LayoutConstants.barWidth)
				* this.courseData.size(), LayoutConstants.graphHeight + 2
				* LayoutConstants.yOffset));		
		this.setBackground(Color.white);
	}

	/**
	 * Paint method
	 * 
	 * @param g
	 *            a Graphics object on which to paint
	 */
	public void paint(Graphics g) {
		super.paint(g);		
		int radius = 100;
		
		//first compute the total number of students
		double total = 0.0;
		for (CourseRecord courseRecord : courseData) {
			total += courseRecord.getNumOfStudents();
		}
		
		//if total == 0 nothing to draw
		if (total != 0) {
			double startAngle = 0.0;
			int i = 0;
			for (CourseRecord courseRecord : courseData) {				
				double ratio = (courseRecord.getNumOfStudents() / total) * 360.0;
				//draw the arc
				g.setColor(LayoutConstants.subjectColors[i%LayoutConstants.subjectColors.length]);
				g.fillArc(LayoutConstants.xOffset, LayoutConstants.yOffset, 2 * radius, 2 * radius, (int) startAngle, (int) ratio);
				startAngle += ratio;
				i++;
			}			
		}
	}

	/**
	 * Informs this observer that the observed CourseData object has changed
	 * 
	 * @param o
	 *            the observed CourseData object that has changed
	 */
	public void update(ObservablePie o) {
		CoursePieData data = (CoursePieData) o;
		this.courseData = data.getUpdate();

		this.setPreferredSize(new Dimension(2 * LayoutConstants.xOffset
				+ (LayoutConstants.barSpacing + LayoutConstants.barWidth)
				* this.courseData.size(), LayoutConstants.graphHeight + 2
				* LayoutConstants.yOffset));
		this.revalidate();
		this.repaint();
	}

	private Vector<CourseRecord> courseData;
}