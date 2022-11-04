package projectRepo.model.extra;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
@Embeddable
public class MyKey implements Serializable {

//	implements serializable is must acc to sources
	

	   
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		private int empid;

	   @JoinColumn(name="p_id")
	    private int p_id;

	    
	    MyKey(){
	    	
	    }


		public MyKey(int empid, int p_id) {
			super();
			this.empid = empid;
			this.p_id = p_id;
		}


		public int getEmpid() {
			return empid;
		}


		public void setEmpid(int empid) {
			this.empid = empid;
		}


		public int getP_id() {
			return p_id;
		}


		public void setP_id(int p_id) {
			this.p_id = p_id;
		}


		@Override
		public String toString() {
			return "MyKey [empid=" + empid + ", p_id=" + p_id + "]";
		}
		


}
