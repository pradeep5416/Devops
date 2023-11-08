import java.util.*;
public class Area {
	public void circle(float r) {
		
		double res;
		res=3.14*r*r;
		System.out.println(res);
		
	}
	public static void main(String args[]) {
		Area a=new Area();
		a.circle(3);
	}
	
}
