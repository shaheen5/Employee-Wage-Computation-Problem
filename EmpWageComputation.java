package employeeWageAssignmentProblem;

public class EmpWageComputation {
	public static void main(String []args) {

		System.out.println("Welcome to Employee Wage Computation Program !");
		//Constants
		int IS_FULL_TIME=1;
		//use random function to generate 0 and 1
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");

	}

}
