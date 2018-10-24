import java.util.Scanner;

public class Sphere {
	public static void main(String[] args){
		System.out.print("Latitude 1:");
		Scanner s=new Scanner(System.in);
		double latangledeg = s.nextDouble();
		double latanglemin = s.nextDouble()/60;
		
		double phideg = latangledeg + latanglemin;
		double phi1 = phideg * Math.PI/180;

		
		System.out.print("Longitude 1:");

		double lonangledeg = s.nextDouble();
		double lonanglemin = s.nextDouble()/60;
		
		double lambdadeg = lonangledeg + lonanglemin;
		double lambda1 = lambdadeg * Math.PI/180;

		
		System.out.println("Latitude 2:");
//		Scanner x=new Scanner(System.in);
		double latangledeg2 = s.nextDouble();
		double latanglemin2 = s.nextDouble()/60;
		
		double phideg2 = latangledeg2 + latanglemin2;
		double phi2 = phideg2 * Math.PI/180;
//		x.close();
	
		System.out.println("Longitude 2:");
//		Scanner a=new Scanner(System.in);
		double lonangledeg2 = s.nextDouble();
		double lonanglemin2 = s.nextDouble()/60;
		
		double lambdadeg2 = lonangledeg2 + lonanglemin2;
		double lambda2 = lambdadeg2 * Math.PI/180;
//		a.close();
		
		double lambdaf = lambda2 - lambda1;
		double angdistance = Math.acos(Math.sin(phi1)*Math.sin(phi2) + Math.cos(phi1)*Math.cos(phi2)*Math.cos(lambdaf));
		System.out.println("Angular Distance = " + angdistance + " radians");
		int distancekm = (int)(angdistance * 6372.795);
		int distancemi = (int) (distancekm * .621371);
		System.out.println("Distance         = " + distancekm + " kilometers");
		System.out.println("Distance         = " + distancemi + " miles");
		
		s.close();
	}
/*		double angdistance = Math.acos(first() + second());
		System.out.print("Angular Distance = " + angdistance + " radians");
		double distancekm = angdistance * 6372.795;
		double distancemi = distancekm * .621371;
		System.out.print("Distance         = " + distancekm + " kilometers");
		System.out.println("Distance       = " + distancemi + " miles");
	}	
	public static double first(){
		double sin1 = Math.sin(latitude1());
		double sin2 = Math.sin(latitude2());
		double first = sin1 * sin2;
		return first;
	}
	public static double second(){
		double cos1 = Math.cos(longitude1());
		double cos2 = Math.cos(latitude2());
		double lambda = longitude1() - longitude2();
		double cosla = Math.cos(lambda);
		double second = cos1 * cos2 * cosla;
		return second;
	}


	
	public static double latitude1(){	
		System.out.print("Latitude 1:");
		Scanner s=new Scanner(System.in);
		double latangledeg = s.nextDouble();
		double latanglemin = s.nextDouble()/6000;
		
		double phideg = latangledeg + latanglemin;
		double phi1 = phideg * Math.PI/180;

		s.close();
		return phi1;
 
	}
	
	public static double longitude1(){
		System.out.print("Longitude 1:");
		Scanner s=new Scanner(System.in);
		double lonangledeg = s.nextDouble();
		double lonanglemin = s.nextDouble()/6000;
		
		double lambdadeg = lonangledeg + lonanglemin;
		double lambda1 = lambdadeg * Math.PI/180;
		s.close();
		return lambda1;
	}
	
	public static double latitude2(){	
		System.out.println("Latitude 2:");
		Scanner s=new Scanner(System.in);
		double latangledeg = s.nextDouble();
		double latanglemin = s.nextDouble()/6000;
		
		double phideg = latangledeg + latanglemin;
		double phi2 = phideg * Math.PI/180;
		s.close();
		return phi2;
 
	}

	public static double longitude2(){
		System.out.println("Longitude 2:");
		Scanner s=new Scanner(System.in);
		double lonangledeg = s.nextDouble();
		double lonanglemin = s.nextDouble()/6000;
		
		double lambdadeg = lonangledeg + lonanglemin;
		double lambda2 = lambdadeg * Math.PI/180;
		s.close();
		return lambda2;
	}
*/}
