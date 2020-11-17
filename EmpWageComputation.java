package employeeWageAssignmentProblem;

public class EmpWageComputation implements IComputeEmpWage {
	//Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private int numOfCompany=0;
	private CompanyEmployeeWage[] companyEmpWageArray;
	
	public EmpWageComputation() {
		companyEmpWageArray = new CompanyEmployeeWage[5];
	}

	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany]=new CompanyEmployeeWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	
	public void computeEmployeeWage() {
		for (int i=0;i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmployeeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	public int computeEmployeeWage(CompanyEmployeeWage companyEmpWage) {
		//Variables
		int empWorkHrs=0,totalEmpWorkingHours=0,totalWorkingDays=0;
		//computation
		while(totalEmpWorkingHours <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
         	return totalEmpWorkingHours * companyEmpWage.empRatePerHour;
	}

	public static void main(String []args) {
		EmpWageComputation empWageBuilder =new EmpWageComputation();
		empWageBuilder.addCompanyEmpWage("Dmart",20,20,100);
		empWageBuilder.addCompanyEmpWage("Reliance",15,10, 120);
		empWageBuilder.addCompanyEmpWage("Samsung",10,25, 80);
		empWageBuilder.computeEmployeeWage();

	}
}
