package employeeWageAssignmentProblem;

public class EmpWageComputation {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String []args) {

		System.out.println("Welcome to Employee Wage Computation Program !");
		//variables
		int empWorkHrs=0;
		int empWage=0;
		//computation
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch (empCheck) {
			case IS_PART_TIME: empWorkHrs=4;
				           break;
			case IS_FULL_TIME: empWorkHrs=8;
	                   		   break;
			default : empWorkHrs=0;
		}
		empWage=empWorkHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage :- "+empWage);

	}

}
