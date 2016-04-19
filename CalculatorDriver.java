public class CalculatorDriver
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		double [] numb = new double [5];
		numb[0] = 4.2;
		numb[1] = 12.9;
		numb[2] = 99.6;
		numb[3] = 1.111;
		numb[4] = 67.43;

		System.out.println("The sum is " + calc.getSum(numb) + ".");
		System.out.println("The average is " + calc.getAverage(numb) + ".");
		System.out.println("The product is " + calc.getProduct(numb) + ".");
	}
}
