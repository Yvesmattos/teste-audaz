package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import controllers.FareController;
import models.Fare;
import models.Operator;

public class Program {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		String r = "y";
        Fare fare = new Fare();
        
        System.out.println(fare.getInsertedDate());
        List<Operator> operators = new ArrayList<>();

        while(r.equals("y")){
        	System.out.println("Informe o valor da tarifa a ser cadastrada:");
            double fareValueInput = sc.nextDouble();
            fare.setValue(fareValueInput);

            System.out.println("Informe o código da operadora para a tarifa:");
            System.out.println("Exemplos: OP01, OP02, OP03...");
            sc.nextLine();
            String operatorCodeInput = sc.nextLine();
            
            FareController fareController = new FareController();
            fareController.createFare(fare, operators, operatorCodeInput);
            
            
            System.out.println("Continuar ?");
            r =  sc.nextLine();
            System.out.println("-------");
        };
        
        sc.close();
		
	}

}
