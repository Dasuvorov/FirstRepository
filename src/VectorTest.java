import java.util.*;
public class VectorTest{
	
	private double x ;
	private double y ;
	private double z;
	
	public VectorTest(){
		
	}
	public VectorTest(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public  double sqrtVector(){
		double  resault = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2)); 
		
		return resault;
	}
	
	public  double sqrtVector(double x, double y, double z){
				this.x = x;
				this.y = y;
				this.z = z;
		double  resault = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
				return resault;
			}	
			
	
				public double scalarVector(){
		double  scalar = Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2); 
		
		return scalar;
				}
	}
