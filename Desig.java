/**
 * 
 */
package projectRepo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Desig{
	

	@Id
	private String desigcode;
	
	private String designame;
		
	public Desig(){
		
	}
	
	public Desig(String desigcode, String designame) {
		super();
		this.desigcode = desigcode;
		this.designame = designame;
	}

	public String getDesigcode() {
		return desigcode;
	}

	public void setDesigcode(String desigcode) {
		this.desigcode = desigcode;
	}

	public String getDesigname() {
		return designame;
	}

	public void setDesigname(String desigName) {
		this.designame = desigName;
	}

	@Override
	public String toString() {
		return "Desig [desigcode=" + desigcode + ", desigName=" + designame +"]";
	}


}
