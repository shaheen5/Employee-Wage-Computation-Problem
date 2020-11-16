package employeeWageAssignmentProblem;

public class EmpWageComputation {
	//Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private  final String company ;
	private  final int empRatePerHour;
	private  final int numOfWorkingDays;
	private  final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWageComputation(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}

	public void computeEmployeeWage() {
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
         	totalEmpWage=totalEmpWorkingHours * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for company :"+company+" is: "+totalEmpWage;
	}

	public static void main(String []args) {
		EmpWageComputation dmart =new EmpWageComputation("Dmart",20,20,100);
		EmpWageComputation reliance =new EmpWageComputation("Reliance",10,25,120);
		EmpWageComputation samsung =new EmpWageComputation("Samsung",15,20,80);
		dmart.computeEmployeeWage();
		System.out.println(dmart);
		reliance.computeEmployeeWage();
		System.out.println(reliance);
		samsung.computeEmployeeWage();
		System.out.println(samsung);

	}

}
