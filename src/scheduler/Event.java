package scheduler;

public class Event {
	private String time;
	private String description;
	
	public Event(String time, String description) {
		this.time = time;
		this.description = description;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
		
	}
	
	public String toString() {
		return time + " - " + description;
	}
	

}
