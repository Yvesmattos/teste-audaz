package services;

import java.util.Calendar;

import models.Fare;
import models.Operator;

public class FareService {

	public void create(Fare fare, Operator operator) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -6);
		if (operator.getFare().getStatus() == 1 && operator.getFare().getValue() == fare.getValue()) {
			throw new Exception("Não foi possível cadastrar essa tarifa. Já existe uma com este valor vigente");
		}
		operator.setFare(fare);

	}
}
