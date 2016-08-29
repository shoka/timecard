package me.linknext.timecard.javabean;

import java.sql.Date;
import java.sql.Timestamp;

public class Calendar {

	/** 日付 */
	private Date date;
	/** 稼働区分 */
	private String workingDiv;
	/** 登録者日時 */
	private Timestamp etrTs;
	/** 登録者ID */
	private String etrId;
	/** 更新者日時 */
	private Timestamp renTs;
	/** 更新者ID */
	private String renId;
	/** 削除フラグ */
	private String delFg;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWorkingDiv() {
		return workingDiv;
	}

	public void setWorkingDiv(String workingDiv) {
		this.workingDiv = workingDiv;
	}

	public Timestamp getEtrTs() {
		return etrTs;
	}

	public void setEtrTs(Timestamp etrTs) {
		this.etrTs = etrTs;
	}

	public String getEtrId() {
		return etrId;
	}

	public void setEtrId(String etrId) {
		this.etrId = etrId;
	}

	public Timestamp getRenTs() {
		return renTs;
	}

	public void setRenTs(Timestamp renTs) {
		this.renTs = renTs;
	}

	public String getRenId() {
		return renId;
	}

	public void setRenId(String renId) {
		this.renId = renId;
	}

	public String getDelFg() {
		return delFg;
	}

	public void setDelFg(String delFg) {
		this.delFg = delFg;
	}

}
