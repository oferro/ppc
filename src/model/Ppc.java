package model;

import java.sql.Timestamp;

public class Ppc {

	private int id;
	private String name;
	private String manuf;
	private String enginType;
	private String engUourStart;
	private String fuelQt;
	private String grName;
	private Timestamp last_update;

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", manuf=" + manuf
				+ ", enginType=" + enginType + ", engUourStart=" + engUourStart
				+ ", fuelQt=" + fuelQt + ", grName=" + grName
				+ ", last_update=" + last_update + "]";
	}

	// -------------------------------------- Constractur

	public Ppc() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Ppc(int id, String name, String manuf, String enginType,
			String engUourStart, String fuelQt, String grName,
			Timestamp last_update) {
		super();
		setId(id);
		setName(name);
		setManuf(manuf);
		setEnginType(enginType);
		setEngUourStart(engUourStart);
		setFuelQt(fuelQt);
		setGrName(grName);
		setLast_update(last_update);
	}

	// -------------------------------------- Getter & setter

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

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	public String getEnginType() {
		return enginType;
	}

	public void setEnginType(String enginType) {
		this.enginType = enginType;
	}

	public String getEngUourStart() {
		return engUourStart;
	}

	public void setEngUourStart(String engUourStart) {
		this.engUourStart = engUourStart;
	}

	public String getFuelQt() {
		return fuelQt;
	}

	public void setFuelQt(String fuelQt) {
		this.fuelQt = fuelQt;
	}

	public String getGrName() {
		return grName;
	}

	public void setGrName(String grName) {
		this.grName = grName;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

}
