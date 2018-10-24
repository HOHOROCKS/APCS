import java.text.DecimalFormat;
import java.util.*;

public class PEEB_2{
	public static void main(String[] args){
		DecimalFormat df1 = new DecimalFormat("0.00E00");
		Scanner s=new Scanner(System.in);
		String planet=s.next();
		double au=s.nextDouble();
		double rp=s.nextDouble();
		double albedo=s.nextDouble();
		double SB=5.6704e-8, rs=7e5, Dp=1.5e8*au, ss=6.42e7;
		double Sp=ss*rs*rs/Dp/Dp, SAve=Sp/4, SAlpha=SAve*(1-albedo);
		double Tp=Math.pow(SAlpha/SB, .25);
		System.out.println("Calculate radiant power per unit area for Sun and Planet using\nStefan-Boltzman Law. From balance equation for Planet,\n(Power in) = (Power out), predict temperature of Planet.\nPlanet: distance of Planet from Sun (AU): radius of Planet (km): albedo of Planet: photon flux SP = " + Math.round(Sp));
		System.out.println("average photon flux SAve = "+Math.round(SAve));
		System.out.println("including albedo SAve x (1 - alpha) = "+Math.round(SAlpha));
		System.out.println("temperature TP (K) = "+Math.round(Tp)+"\ntemperature TP (C) = "+Math.round(Tp-273.15));
	}
}