package employeeWageAssignmentProblem;

public class EmpWageComputation {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main(String []args) {

		System.out.println("Welcome to Employee Wage Computation Program !");
		//variables
		int empWorkHrs=0,totalEmpWorkingHours=0,totalWorkingDays=0;
		//computation
		while(totalEmpWorkingHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch (empCheck) {
				case IS_PART_TIME: empWorkHrs=4;
						   break;
				case IS_FULL_TIME: empWorkHrs=8;
						   break;
				default : empWorkHrs=0;
			}
			totalEmpWorkingHours += empWorkHrs;
			System.out.println("Day#:"+totalWorkingDays + "  Employee Work Hours:"+empWorkHrs);
		}
		int totalEmpWage=totalEmpWorkingHours * EMP_RATE_PER_HOUR; 
		System.out.println("Total Employee Wage : "+totalEmpWage);
	}

}
