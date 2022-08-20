package models;

public class Operator extends Model {

	private String code;

	private Fare fare = new Fare();

	public Operator(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Fare getFare() {
		return fare;
	}

	public void setFare(Fare fare) {
		this.fare = fare;
	}

}
