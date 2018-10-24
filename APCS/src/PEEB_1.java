import java.text.DecimalFormat;
import java.util.*;

public class PEEB_1{
	public static final double c = 299792500;
	public static final double h = 6.626068 * Math.pow(10, -34); 
	public static final double k = 1.38066 * Math.pow(10, -23);
	public static void main(String[] args){
		DecimalFormat df1 = new DecimalFormat("0.00E00");
		Scanner s = new Scanner(System.in);
		double L = s.nextDouble()/1e6;
		double T = s.nextDouble();
		double B = 2*h*c*c*Math.pow(L, -5)/(Math.exp(h*c/(L*k*T))-1);
		System.out.println("Calculate radiant photon flux at a given wavelength");
		System.out.println("and temperature using Planck's Law");
		System.out.print("wavelength in microns: temperature in degrees Kelvin: ");
		System.out.println("radiant flux B = " + df1.format(B).toLowerCase());
	}
}