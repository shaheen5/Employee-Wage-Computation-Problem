package employeeWageAssignmentProblem;
import java.util.*;

public class EmpWageComputation implements IComputeEmpWage {
	//Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private int numOfCompany=0;
	private LinkedList<CompanyEmployeeWage> companyEmpWageList;
	private Map<String,CompanyEmployeeWage> companyToEmpWageMap;
	
	public EmpWageComputation() {
		companyEmpWageList = new LinkedList<>() ;
		companyToEmpWageMap=new HashMap<>();
	}

	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		CompanyEmployeeWage companyEmpWage=new CompanyEmployeeWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company,companyEmpWage);
	}
	
	public void computeEmployeeWage() {
		for (int i=0;i < companyEmpWageList.size(); i++) {
			CompanyEmployeeWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmployeeWage(companyEmpWage));
			System.out.println(companyEmpWage);
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
