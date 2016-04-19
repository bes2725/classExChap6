/**Bailey Spicer
*Calcuator class */

public class Calculator {

	public static double getSum(double n1, double n2)
	{
		double sum = 0.0;
		sum = n1 + n2;
		return sum;
	}
	public static double getSum(double n1, double n2, double n3)
	{
		double sum = 0.0;
		sum = n1 + n2 + n3;
		return sum;
	}
	public static double getSum(double [] numb)
	{
		double sum = 0.0;
		for(int i=0; i<numb.length; i++)
		{
			sum+=numb[i];
		}
		return sum;
	}
	public static double getAverage(double n1, double n2)
	{
		double sum = 0.0;
		sum = n1 + n2;
		return (sum/2);
	}
	public static double getAverage(double n1, double n2, double n3)
	{
		double sum = 0.0;
		sum = n1 + n2 + n3;
		return (sum/3);
	}
	public static double getAverage(double [] numb)
	{
		double sum = 0.0;
		for(int i=0; i<numb.length; i++)
		{
			sum+=numb[i];
		}
		return (sum/numb.length);
	}
	public static double getProduct(double n1, double n2)
	{
		double prod = 0.0;
		prod = n1*n2;
		return prod;
	}
	public static double getProduct(double n1, double n2, double n3)
	{
		double prod = 0.0;
		prod = n1*n2*n3;
		return prod;
	}
	public static double getProduct(double [] numb)
	{
		double prod = 0.0;
		for(int i=0; i<numb.length; i++)
		{
			double temp = 1;
			temp = temp*numb[i];
			prod = temp;
		}
		return prod;
	}
}
