package employeeWageAssignmentProblem;

public class EmpWageComputation {
	//Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	public static void computeEmployeeWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		//Variables
		int empWorkHrs=0,totalEmpWorkingHours=0,totalWorkingDays=0;
		//computation
		while(totalEmpWorkingHours <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
		int totalEmpWage=totalEmpWorkingHours * empRatePerHour; 
		System.out.println("Total Employee Wage for Company: "+company+" is: "+totalEmpWage);
	}

	public static void main(String []args) {
		computeEmployeeWage("Dmart",20,20,100);
		computeEmployeeWage("Reliance",10,25,120);
		computeEmployeeWage("Samsung",15,20,80);
	}

}
