package models;

import java.util.Calendar;
import java.util.Date;

public class Fare extends Model {
	private String operatorId;
	private int status;
	private double value;
	private Date insertedDate;

	public Fare() {
		status = 1;
		insertedDate = Calendar.getInstance().getTime();
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	
	
	public Date getInsertedDate() {
		return insertedDate;
	}

	@Override
	public String toString() {
		return "Fare [operatorId=" + operatorId + ", status=" + status + ", value=" + value + "]";
	}

}
