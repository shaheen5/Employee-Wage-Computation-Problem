package employeeWageAssignmentProblem;

public class EmpWageComputation {
	public static void main(String []args) {

		System.out.println("Welcome to Employee Wage Computation Program !");
		//Constants
		int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		//variables
		int empWorkHrs=0;
		int empWage=0;
		//use random function to generate 0 and 1
		double empCheck=Math.floor(Math.random()*10)%3;
		if (empCheck == IS_PART_TIME)
			empWorkHrs=4;
		else if (empCheck == IS_FULL_TIME)
			empWorkHrs=8;
		else
			empWorkHrs=0;
		empWage=empWorkHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage :- "+empWage);

	}

}
