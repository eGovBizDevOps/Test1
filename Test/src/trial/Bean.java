package trial;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
 
@ManagedBean(name="bean", eager=true)
@SessionScoped

public class Bean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	public Bean()
	{
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
