package formatting;

class SalaryCalculator
{
	private static final double RATES_OF_INCOME_TAX = 10;
	private static final double RATES_OF_HEALTH_INSURANCE = 1.5;
	private static final double RATES_OF_SOCIAL_INSURANCE = 7;
	private static final int SALARY_BOUNDARY = 3000;

	public static void main(String[] args)
	{
		int grossSalary = 1000;
		int netSalary = SalaryCalculator.calculateNetSalary(grossSalary);
		SalaryCalculator.printIncomeInformation(grossSalary, netSalary);
	}

	public static int calculateNetSalary(int grossSalary)
	{
		double deductionIncomeTax = grossSalary * (RATES_OF_INCOME_TAX / 100);
		double deductionHealthInsurance = grossSalary * (RATES_OF_HEALTH_INSURANCE / 100);
		double deductionSocialInsurance = grossSalary * (RATES_OF_SOCIAL_INSURANCE / 100);

		return grossSalary - (int)deductionIncomeTax - (int)deductionHealthInsurance - (int)deductionSocialInsurance;
	}

	public static void printIncomeInformation(int grossSalary, int netSalary)
	{
		System.out.println("Gross income: " + grossSalary + " dollar\nNet income:   " + netSalary + "dollar\n");

		if (SALARY_BOUNDARY < grossSalary)
		{
			System.out.println("You get great salary!\nDo your best at work!\n");
		}
		if (SALARY_BOUNDARY >= grossSalary)
		{
			System.out.println("You're glowing up now!\nDo your best at work!\n");
		}
	}
}
