package projectRepo.model.extra;

public class DeptNameWithCount {
	
	private String deptname;
	private long count;
	
	DeptNameWithCount(){}
	
	public DeptNameWithCount(String deptname, long count) {
		super();
		this.deptname = deptname;
		this.count = count;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DeptNameWithCount [deptname=" + deptname + ", count=" + count + "]";
	}

}
