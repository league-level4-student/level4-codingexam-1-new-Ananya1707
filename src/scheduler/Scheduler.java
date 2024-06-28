package scheduler;


import java.util.Scanner;

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
public class Scheduler{

    public static void main(String[] args) {
    	DaysOfTheWeek[] daysOfTheWeekObjects = DaysOfTheWeek.values();
    	
    	
    	Scanner s = new Scanner(System.in);
    	Boolean end = true;
    	
    	while(end) {
    		System.out.println("enter the number for the action you want to do. (add event - 1, view event - 2, remove event - 3, exit - 4)");
    		int userAction = s.nextInt();
    		s.nextLine();
    		
    		switch(userAction) {
    
    			case 1:
    				System.out.println("what day is the event:");
    				String day = s.nextLine();
    				
    				for(int i =  0; i < daysOfTheWeekObjects.length; i++) {
    					if(day.equalsIgnoreCase(daysOfTheWeekObjects[i].name())) {
    						
    						System.out.println("what time is the event?");
    						String time = s.nextLine();
    						
    						System.out.println("enter a name for your event.");
    						String description = s.nextLine();
    						
    						try {
								daysOfTheWeekObjects[i].addEvent(new Event(time, description));
							} catch (SchedulingConflictException e) {
								e.printStackTrace();
							}
    						
    						break;
    					
    					}
    					
    				}
    				
    				break;
    				
    			case 2:
    				System.out.println("which day of the week would u like to view the events?");
    				String day1 = s.nextLine();
    				
    				for(int i =  0; i < daysOfTheWeekObjects.length; i++) {
    					if(day1.equalsIgnoreCase(daysOfTheWeekObjects[i].name())) {
    						daysOfTheWeekObjects[i].viewEvent();
    						
    						break;
    						
    					}
    				}
    				
    				break;
    			
    			case 3:
    				System.out.println("which day of the week would you like to remove events from?");
    				String day2 = s.nextLine();
    				
    				System.out.println("what time is the event at?");
    				String time2 = s.nextLine();
    				
    				for(int i =  0; i < daysOfTheWeekObjects.length; i++) {
    					if(day2.equalsIgnoreCase(daysOfTheWeekObjects[i].name())) {
    						daysOfTheWeekObjects[i].removeEvent(time2);
    						
    						break;
    						
    					}
    				}
    				
    				break;
    				
    			case 4:
    				end = false;
    				break;

    		
    		}
    	}
    	


    }
    
    
		
		
	
}
