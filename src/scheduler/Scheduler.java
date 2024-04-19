package scheduler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler implements ActionListener {

    public static void main(String[] args) {
    	userInterface();

    }
    
    public enum DaysOfTheWeek{
    	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public static void userInterface() {
    	JFrame frame = new JFrame();
    	frame.show(true);
    	
    	JPanel panel = new JPanel();
    	frame.add(panel);
    	
    	JButton addEventB = new JButton();
    	panel.add(addEventB);
    	addEventB.addActionListener(null);
    	addEventB.setText("Add Event");
    	
    	JButton viewEventsB = new JButton();
    	panel.add(viewEventsB);
    	viewEventsB.addActionListener(null);
    	viewEventsB.setText("View Events");
    	
    	
    	//JLabel viewEventsL = new JLabel()
    	
    	JButton removeEventB = new JButton();
    	panel.add(removeEventB);
    	removeEventB.addActionListener(null);
    	removeEventB.setText("Remove Event");
    	
    	frame.pack();
    	
    }
    
    void addEvent() {
    	
    }
    
    void removeEvent() {
    	
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object button = arg0.toString();
		
		if(button.equals("viewEvents")) {
			
		}
		
		if(button.equals("addEvent")) {
			addEvent();
		}
		
		if(button.equals("removeEvent")) {
			removeEvent();
		}
		
		
		
		
	}
}
