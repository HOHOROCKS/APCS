
public class PEEB_Jr {
	public static final double c = 299792500;
	public static final double h = 6.626068 * Math.pow(10, -34); 
	public static final double k = 1.38066 * Math.pow(10, -23);
	public static void main(String[] args){
		double temperature = 5800, wavelength = 1e-5;
		double b = (numerator(temperature, wavelength)) / (denominator(temperature, wavelength));
		System.out.println(b);
		
	}
	public static double numerator(double temperature, double wavelength){
		return 2 * h * c * c * (1/wavelength*wavelength*wavelength*wavelength*wavelength);
	}
	public static double denominator(double temperature, double wavelength){
		return Math.pow(Math.E,((h * c)/(wavelength * k * temperature))) - 1;
	}
}
