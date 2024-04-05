package scheduler;

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
public class Scheduler {

    public static void main(String[] args) {
    	

    }
    
    public enum DaysOfTheWeek{
    	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public void userInterface() {
    	JFrame frame = new JFrame();
    	
    	JPanel panel = new JPanel();
    	frame.add(panel);
    	
    	JButton addEvent = new JButton();
    	panel.add(addEvent);
    	
    	JButton viewEvents = new JButton();
    	panel.add(viewEvents);
    	
    	JButton removeEvent = new JButton();
    	panel.add(removeEvent);
    	
    }
    
    void addEvent() {
    	
    }
}
