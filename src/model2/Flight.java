package model2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the flights database table.
 * 
 */
@Entity
@Table(name="flights")
@NamedQuery(name="Flight.findAll", query="SELECT f FROM Flight f")
public class Flight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int fID;

	private String fAirField;

	@Temporal(TemporalType.DATE)
	private Date fDate;

	private String fFltRoute;

	private Time fLndHour;

	private int flPPC;

	private Timestamp fTimeStemp;

	private Time fToHour;

	private int fUser;

	public Flight() {
	}

	public int getFID() {
		return this.fID;
	}

	public void setFID(int fID) {
		this.fID = fID;
	}

	public String getFAirField() {
		return this.fAirField;
	}

	public void setFAirField(String fAirField) {
		this.fAirField = fAirField;
	}

	public Date getFDate() {
		return this.fDate;
	}
	
	public void setFDate(Date fDate) {
		this.fDate = fDate;
	}

	public String getFFltRoute() {
		return this.fFltRoute;
	}

	public void setFFltRoute(String fFltRoute) {
		this.fFltRoute = fFltRoute;
	}

	public Time getFLndHour() {
		return this.fLndHour;
	}

	public void setFLndHour(Time fLndHour) {
		this.fLndHour = fLndHour;
	}

	public int getFlPPC() {
		return this.flPPC;
	}

	public void setFlPPC(int flPPC) {
		this.flPPC = flPPC;
	}

	public Timestamp getFTimeStemp() {
		return this.fTimeStemp;
	}

	public void setFTimeStemp(Timestamp fTimeStemp) {
		this.fTimeStemp = fTimeStemp;
	}

	public Time getFToHour() {
		return this.fToHour;
	}

	public void setFToHour(Time fToHour) {
		this.fToHour = fToHour;
	}

	public int getFUser() {
		return this.fUser;
	}

	public void setFUser(int fUser) {
		this.fUser = fUser;
	}

}