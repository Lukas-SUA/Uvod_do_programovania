/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	int earth_radius = 6378;    // globálna premenná 
	int glob_sum = 0;           // globálna premenná
	
    static int aandb(int a, int b)
    {
        int sum = a+b;
        
        return sum; 
    }

	public static void main(String[] args) {
		
		double k2c = -273.15;  // lokálna premenná 
		
		Main m = new Main();    // sprístupnenie globálnej premennej 
		Main glvs = new Main(); 
		
	    glvs.glob_sum = aandb(5,6); // pouzitie funkcie 
	                                // a navrat hodnoty do globalnej premennej
		
		System.out.println("Polomer zeme: " + m.earth_radius + "km");
		System.out.println("Kelvin na °C: " + k2c);
		System.out.println("Sucet je: " + glvs.glob_sum);
	}
}
