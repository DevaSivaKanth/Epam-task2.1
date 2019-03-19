/**
 * This Program calculates Simple interest and Compound Interest
 * @author Siva Kanth
 *
 */
public class CalculateInterest {
	/**
	 * Calculates Compound Interest
	 * @param Principle
	 * @param Ratio
	 * @param Time
	 * @param Years
	 * @return
	 */
	public int CalculateCompoundInterest(int Principle,int Ratio,int Time,int Years) {
		return (int)(Principle*Math.pow((1+Ratio/Time), Years*Time));
	}
	/**
	 * Calculates Simple Interest
	 * @param Principle
	 * @param Rate
	 * @param Time
	 * @return
	 */
	public int CalculateSimpleInterest(int Principle,int Rate,int Time) {
		return (Principle*Rate*Time)/100;
	}
	/**
	 * Driver Code to test the program
	 * @param args
	 */
	public static void main (String[] args) {
		
		CalculateInterest obj=new CalculateInterest();
		
		System.out.println("Principle = 100, Rate = 2, Time = 3, Years = 1 \nCompoundInterest =  "+obj.CalculateCompoundInterest(100, 2, 3, 1)+"\n");
		
		System.out.println("Principle = 100, Rate = 2, Time = 3 \nSimpleInterest =  "+obj.CalculateSimpleInterest(100, 2, 3));
	}
}
