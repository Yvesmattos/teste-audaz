package services;

import java.util.List;

import models.Operator;

public class OperatorService {

	public Operator getOperatorByCode(List<Operator> operators, String operatorCode) {
		Operator selectedOperator = operators.stream().filter(o -> o.getCode().equals(operatorCode)).findAny()
				.orElse(null);

		return selectedOperator;
	}

	public void create(Operator op, List<Operator> operators) throws Exception {
		if (op.getId().equals(null))
			throw new Exception("Não é possível salver um registro com Id não preenchido");

		Operator opAlreadyExists = operators.stream().filter(o -> o.getId().equals(op.getId())).findAny().orElse(null);
		if (opAlreadyExists != null)
			throw new Exception("Já existe um registro para este operador com o id" + op.getId());

		operators.add(op);
	}

}
