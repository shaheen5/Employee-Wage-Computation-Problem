package employeeWageAssignmentProblem;

	public interface IComputeEmpWage{
		public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
		public void computeEmployeeWage();
		public int getTotalWage(String company);
	}

