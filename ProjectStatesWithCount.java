package projectRepo.model.extra;

public class ProjectStatesWithCount {
     
	String state;
	long count;
	
	public ProjectStatesWithCount(){
		
	}
	public ProjectStatesWithCount(String state, long count) {
		super();
		this.state = state;
		this.count = count;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "ProjectStatesWithCount [state=" + state + ", count=" + count + "]";
	}
}
