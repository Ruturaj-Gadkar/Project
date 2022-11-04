package projectRepo.model.extra;

public class EmployeeAndStatus {

	
	private String state;
	private long count;
public EmployeeAndStatus() {
	// TODO Auto-generated constructor stub
}
public EmployeeAndStatus(String state, long count) {
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
	return "EmployeeAndStatus [state=" + state + ", count=" + count + "]";
}




}
