package model2;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ppc database table.
 * 
 */
@Entity
@NamedQuery(name="Ppc.findAll", query="SELECT p FROM Ppc p")
public class Ppc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ppID;

	private String ppEmginType;

	private BigDecimal ppEngHourStart;

	private String ppFuelQt;

	private String ppGrName;

	private Timestamp ppLastUpdate;

	private String ppManuf;

	private String ppName;

	@Lob
	private byte[] ppPic;

	public Ppc() {
	}

	public int getPpID() {
		return this.ppID;
	}

	public void setPpID(int ppID) {
		this.ppID = ppID;
	}

	public String getPpEmginType() {
		return this.ppEmginType;
	}

	public void setPpEmginType(String ppEmginType) {
		this.ppEmginType = ppEmginType;
	}

	public BigDecimal getPpEngHourStart() {
		return this.ppEngHourStart;
	}

	public void setPpEngHourStart(BigDecimal ppEngHourStart) {
		this.ppEngHourStart = ppEngHourStart;
	}

	public String getPpFuelQt() {
		return this.ppFuelQt;
	}

	public void setPpFuelQt(String ppFuelQt) {
		this.ppFuelQt = ppFuelQt;
	}

	public String getPpGrName() {
		return this.ppGrName;
	}

	public void setPpGrName(String ppGrName) {
		this.ppGrName = ppGrName;
	}

	public Timestamp getPpLastUpdate() {
		return this.ppLastUpdate;
	}

	public void setPpLastUpdate(Timestamp ppLastUpdate) {
		this.ppLastUpdate = ppLastUpdate;
	}

	public String getPpManuf() {
		return this.ppManuf;
	}

	public void setPpManuf(String ppManuf) {
		this.ppManuf = ppManuf;
	}

	public String getPpName() {
		return this.ppName;
	}

	public void setPpName(String ppName) {
		this.ppName = ppName;
	}

	public byte[] getPpPic() {
		return this.ppPic;
	}

	public void setPpPic(byte[] ppPic) {
		this.ppPic = ppPic;
	}

}