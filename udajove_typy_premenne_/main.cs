/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
using System;

class Globalvar  // definovanie premennych globalnych
{
  public static int earth_radius = 6378;    // globálna premenná 
  public static int glob_sum = 0;           // globálna premenná  
}

class HelloWorld 
{
  // funkcia 
  static int aandb(int a, int b)
  {
    int sum = a+b;
        
    return sum; 
  } 
 
  static void Main() 
  {
    double k2c = -273.15;  // lokálna premenná
    
    Globalvar.glob_sum = aandb(5,6); // pouzitie funkcie 
	                       // a navrat hodnoty do globalnej premennej
	                       
    Console.WriteLine("Polomer zeme: " + Globalvar.earth_radius + "km");
	Console.WriteLine("Kelvin na °C: " + k2c);
    Console.WriteLine("Sucet je: " + Globalvar.glob_sum);
  }
}