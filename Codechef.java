/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(calc(0,2));
	}
	static double calc(double tc, double r){
		double t = 9*tc/5 + 32;
		double HI = -42.379 +2.04901523*t + 10.14333127*r - 0.22475541*t*r - 6.83783*0.001*t*t 
		        - 5.481717*0.01*r*r + 1.22874*0.001*t*t*r + 8.5282*0.0001*t*r*r - 1.99*0.000001*t*t*r*r;
		return HI;
	}
}
