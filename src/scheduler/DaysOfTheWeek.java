package scheduler;

import java.beans.EventSetDescriptor;
import java.util.TreeMap;

public enum DaysOfTheWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	private LinkedList<Event> events = new LinkedList<Event>();
	
	public LinkedList<Event> getEvents(){
		return events;
	}
	
	public void addEvent(Event event) throws SchedulingConflictException{
		Node<Event> current = events.getHead();
		
		while(current != null) {
			if(current.getValue().getTime().equals(event.getTime())) {
				throw new SchedulingConflictException("you already have an event at this time");
			}
			current = current.getNext();
		}
		
		events.add(event);
		sortEvents();
	}
	
	public void removeEvent(String time) {
		System.out.println(time);
		Node<Event> current = events.getHead();
		int pos = 0;
		
		while(current != null) {
			if(current.getValue().getTime().equalsIgnoreCase(time)) {
				events.remove(pos);
				return;
			}
			current = current.getNext();
			pos++;
		}
		
		System.out.println("not found");
		
	}
	
	public void viewEvent() {
		if(events.size() > 0) {
			events.print();
		}else {
			System.out.println("you have no events");
		}
	}
	
	public void sortEvents() {
		TreeMap<String, Event> sort = new TreeMap<String, Event>();
		LinkedList<Event> sorted = new LinkedList<Event>();
		
		Node<Event> current = events.getHead();
		while(current != null) {
			sort.put(current.getValue().getTime(), current.getValue());
			current = current.getNext();
		}
		
		for(Event e: sort.values()) {
			sorted.add(e);
		}
		
		events = sorted;
		
//		if(events.size() > 1) {
//			boolean changed;
//			Node<Event> prev;
//			Node<Event> current;
//			Node<Event> next;
//			do {
//				prev = null;
//				current = events.getHead();
//				next = null;
//				if(current != null) {
//					next = current.getNext();
//				}
//				
//				changed = false;
//			}
//			while(next != null){
//				if(current.getValue()) {
//					
//				}
//				
//			}
//			
//		}
	}
	
	
	

}
