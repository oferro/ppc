package model2;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the flights database table.
 * 
 */
@Entity
@Table(name="flights")
@NamedQuery(name="Flight.findAll", query="SELECT f FROM Flights f")
public class Flights implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int fID;

	private String fAirField;

	@Temporal(TemporalType.DATE)
	private Date fDate;

	private String fFltRoute;

//	@Temporal(TemporalType.TIME)
	private Time fLndHour;

	private int flPPC;

//	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp fTimeStemp;

//	@Temporal(TemporalType.TIME)
	private Time fToHour;

	private int fUser;

	public Flights() {
	}

	public int getfID() {
		return this.fID;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public String getfAirField() {
		return this.fAirField;
	}

	public void setfAirField(String fAirField) {
		this.fAirField = fAirField;
	}

	public Date getfDate() {
		return this.fDate;
	}
	
//	public String getFDate() {
//		return this.fDate.toString();
//	}
	
	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}

	public String getfFltRoute() {
		return this.fFltRoute;
	}

	public void setfFltRoute(String fFltRoute) {
		this.fFltRoute = fFltRoute;
	}

	public Time getfLndHour() {
		return this.fLndHour;
	}

	public void setfLndHour(Time fLndHour) {
		this.fLndHour = fLndHour;
	}

	public int getflPPC() {
		return this.flPPC;
	}

	public void setflPPC(int flPPC) {
		this.flPPC = flPPC;
	}

	public Timestamp getfTimeStemp() {
		return this.fTimeStemp;
	}

	public void setfTimeStemp(Timestamp fTimeStemp) {
		this.fTimeStemp = fTimeStemp;
	}

	public Time getfToHour() {
		return this.fToHour;
	}

	public void setfToHour(Time fToHour) {
		this.fToHour = fToHour;
	}

	public int getfUser() {
		return this.fUser;
	}

	public void setfUser(int fUser) {
		this.fUser = fUser;
	}

}