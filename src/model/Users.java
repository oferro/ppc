package model;

import java.sql.Timestamp;

public class Users {


	private int id;
	private String user;
	private String pw;
	private String frName;
	private String lastName;
	private String email;
	private String phone;
	private String qs;
	private String ans;
	private Timestamp last_update;

	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", pw=" + pw
				+ ", frName=" + frName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone
				+ ", qs=" + qs + ", ans=" + ans
				+ ", last_update=" + last_update + "]";
	}

	// -------------------------------------- Constractur

	public Users() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Users(int id, String user, String pw, String fName, String lName,
			String email, String phone, String qs, String ans,
			Timestamp last_update) {
		super();
		setId(id);
		setUser(user);
		setPw(pw);
		setFrName(frName);
		setLastName(lastName);
		setEmail(email);
		setPhone(phone);
		setQs(qs);
		setAns(ans);
		setLast_update(last_update);
	}

	// -------------------------------------- Getter & setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getFrName() {
		return frName;
	}

	public void setFrName(String frName) {
		this.frName = frName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQs() {
		return qs;
	}

	public void setQs(String qs) {
		this.qs = qs;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	
}
