package model;

import java.sql.Timestamp;

public class Flight {

	private int id;
	private int ppcId;
	private int userId;
	private String date;
	private String toHour;
	private String lndHour;
//	private String passenger;
	private String airField;
	private String fltRoute;
//	private String engHourStart;
//	private String engHourEnd;
//	private String fuelQt;
//	private String oilQt;
//	private String otrExp;
//	private String mainten;
//	private String remarks;
	private Timestamp last_update;

	@Override
	public String toString() {
		return "Flight [id=" + id + ", ppcId=" + ppcId + ", userId=" + userId
				+ ", date=" + date + ", toHour=" + toHour + ", lndHour="
				+ lndHour + ", airField="
				+ airField + ", fltRoute=" + fltRoute 
				+ ", last_update=" + last_update + "]";
	}

	// -------------------------------------- Constractur
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, int ppcId, int userId, String date, String toHour,
			String lndHour, String airField, String fltRoute,
			Timestamp last_update) {
		super();
		setId(id);
		setPpcId(ppcId);
		setUserId(userId);
		setDate(date);
		setToHour(toHour);
		setLndHour(lndHour);
//		setPassenger(passenger);
		setAirField(airField);
		setFltRoute(fltRoute);
//		setEngHourStart(engHourStart);
//		setEngHourEnd(engHourEnd);
//		setFuelQt(fuelQt);
//		setOilQt(oilQt);
//		setOtrExp(otrExp);
//		setMainten(mainten);
//		setRemarks(remarks);
		setLast_update(last_update);
	}

	// -------------------------------------- Getter & setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPpcId() {
		return ppcId;
	}

	public void setPpcId(int ppcId) {
		this.ppcId = ppcId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getToHour() {
		return toHour;
	}

	public void setToHour(String toHour) {
		this.toHour = toHour;
	}

	public String getLndHour() {
		return lndHour;
	}

	public void setLndHour(String lndHour) {
		this.lndHour = lndHour;
	}

//	public String getPassenger() {
//		return passenger;
//	}
//
//	public void setPassenger(String passenger) {
//		this.passenger = passenger;
//	}

	public String getAirField() {
		return airField;
	}

	public void setAirField(String airField) {
		this.airField = airField;
	}

	public String getFltRoute() {
		return fltRoute;
	}

	public void setFltRoute(String fltRoute) {
		this.fltRoute = fltRoute;
	}

//	public String getEngHourStart() {
//		return engHourStart;
//	}
//
//	public void setEngHourStart(String engHourStart) {
//		this.engHourStart = engHourStart;
//	}
//
//	public String getEngHourEnd() {
//		return engHourEnd;
//	}
//
//	public void setEngHourEnd(String engHourEnd) {
//		this.engHourEnd = engHourEnd;
//	}
//
//	public String getFuelQt() {
//		return fuelQt;
//	}
//
//	public void setFuelQt(String fuelQt) {
//		this.fuelQt = fuelQt;
//	}
//
//	public String getOilQt() {
//		return oilQt;
//	}
//
//	public void setOilQt(String oilQt) {
//		this.oilQt = oilQt;
//	}
//
//	public String getOtrExp() {
//		return otrExp;
//	}
//
//	public void setOtrExp(String otrExp) {
//		this.otrExp = otrExp;
//	}
//
//	public String getMainten() {
//		return mainten;
//	}
//
//	public void setMainten(String mainten) {
//		this.mainten = mainten;
//	}
//
//	public String getRemarks() {
//		return remarks;
//	}
//
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	// -------------------------------------- Methods

}
