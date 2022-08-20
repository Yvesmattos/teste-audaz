package controllers;

import java.util.List;

import models.Fare;
import models.Operator;
import services.FareService;
import services.OperatorService;

public class FareController {

	private OperatorService operatorService;
	private FareService fareService;

	public FareController() {
		operatorService = new OperatorService();
		fareService = new FareService();
	}

	public void createFare(Fare fare, List<Operator> operators, String operatorCode) throws Exception {
		Operator selectedOperator = operatorService.getOperatorByCode(operators, operatorCode);
		if (selectedOperator != null) {
		}
		if (selectedOperator == null) {
			Operator op = new Operator(operatorCode);
			operatorService.create(op, operators);
			selectedOperator = operatorService.getOperatorByCode(operators, op.getCode());
		}
		fare.setOperatorId(selectedOperator.getId());
		fareService.create(fare, selectedOperator);

		System.out.println("Tarifa cadastrada com sucesso!");
		System.out.println("Operador: " + selectedOperator.getCode() + "\n Tarifa: " + fare.getOperatorId());
	}

}
