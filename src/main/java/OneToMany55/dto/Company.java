package OneToMany55.dto;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
//	------------------------------oning
	@Id
	private int id;
	private String name;
	private String gst;
	
//	@OneToMany
	@OneToMany(fetch = FetchType.EAGER)

	private List<Employee> employee;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGst() {
		return gst;
	}


	public void setGst(String gst) {
		this.gst = gst;
	}


	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}

