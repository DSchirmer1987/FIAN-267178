package musterloesungen.calculatorGK;

import javax.swing.JLabel;

public class Action {

	public static void ActionNumbers1st(JLabel lblNewLabel, String getTxt) {
		lblNewLabel.setText(lblNewLabel.getText() + getTxt);
		CalculatorGUI.str1st = lblNewLabel.getText();
	}

	public static void ActionNumbers2nd(JLabel lblNewLabel, String getTxt) {
		System.out.println(CalculatorGUI.str2ndStart);
		System.out.println(getTxt);
		if (CalculatorGUI.str2ndStart) {
			lblNewLabel.setText(getTxt);
			CalculatorGUI.str2ndStart = false;
		} else {
			lblNewLabel.setText(lblNewLabel.getText() + getTxt);
		}
		CalculatorGUI.str2nd = lblNewLabel.getText();
	}

	public static void ActionCalc(JLabel lblNewLabel, String getTxt) {
		CalculatorGUI.strCalcOp = getTxt;
		CalculatorGUI.str1stSet = true;
		if(CalculatorGUI.chainOp) {			
			ActionResult(lblNewLabel, getTxt);	
		}
		CalculatorGUI.chainOp = true;
	}

	public static void ActionResult(JLabel lblNewLabel, String getTxt) {
		double first = Double.parseDouble(CalculatorGUI.str1st);
		double second = Double.parseDouble(CalculatorGUI.str2nd);
		if(CalculatorGUI.chainOp) {
			CalculatorGUI.str1st = lblNewLabel.getText();
			lblNewLabel.setText("");
		}
		String result = "";

		if (CalculatorGUI.strCalcOp.equals("/")&& second==0) {
			result = "ERROR";
		} else if (CalculatorGUI.strCalcOp.equals("/")) {
			result = CalcBasic.div(first, second);
		} else if (CalculatorGUI.strCalcOp.equals("*")) {
			result = CalcBasic.prod(first, second);
		} else if (CalculatorGUI.strCalcOp.equals("-")) {
			result = CalcBasic.subt(first, second);
		} else if (CalculatorGUI.strCalcOp.equals("+")) {
			result = CalcBasic.sum(first, second);
		}

		lblNewLabel.setText(result);
	}
}
