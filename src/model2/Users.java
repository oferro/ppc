package model2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="Users.findAll", query="SELECT u FROM Users u")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int usID;

	private String usAns;

	private String usEmail;

	private String usFirstName;

	private String usLastName;

	private Timestamp usLastUpdate;

	private String usPhone;

	private String usPw;

	private String usQs;

	private String usUser;

	public Users() {
	}

	public int getUsID() {
		return this.usID;
	}

	public void setUsID(int usID) {
		this.usID = usID;
	}

	public String getUsAns() {
		return this.usAns;
	}

	public void setUsAns(String usAns) {
		this.usAns = usAns;
	}

	public String getUsEmail() {
		return this.usEmail;
	}

	public void setUsEmail(String usEmail) {
		this.usEmail = usEmail;
	}

	public String getUsFirstName() {
		return this.usFirstName;
	}

	public void setUsFirstName(String usFirstName) {
		this.usFirstName = usFirstName;
	}

	public String getUsLastName() {
		return this.usLastName;
	}

	public void setUsLastName(String usLastName) {
		this.usLastName = usLastName;
	}

	public Timestamp getUsLastUpdate() {
		return this.usLastUpdate;
	}

	public void setUsLastUpdate(Timestamp usLastUpdate) {
		this.usLastUpdate = usLastUpdate;
	}

	public String getUsPhone() {
		return this.usPhone;
	}

	public void setUsPhone(String usPhone) {
		this.usPhone = usPhone;
	}

	public String getUsPw() {
		return this.usPw;
	}

	public void setUsPw(String usPw) {
		this.usPw = usPw;
	}

	public String getUsQs() {
		return this.usQs;
	}

	public void setUsQs(String usQs) {
		this.usQs = usQs;
	}

	public String getUsUser() {
		return this.usUser;
	}

	public void setUsUser(String usUser) {
		this.usUser = usUser;
	}

}