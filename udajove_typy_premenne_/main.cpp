/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

using namespace std;

int earth_radius = 6378;    // globálna premenná
int glob_sum = 0;           // globálna premenná  

int aandb(int a, int b) // funkcia 
{
    int sum = a+b;
        
    return sum; 
} 

int main()
{
    double k2c = -273.15;  // lokálna premenná
    
    glob_sum = aandb(5,6); // pouzitie funkcie 
	                       // a navrat hodnoty do globalnej premennej
    
    cout<<"Polomer zeme: " << earth_radius << "km" << endl;
	cout<<"Kelvin na °C: " << k2c << endl;
    cout<<"Sucet je: " << glob_sum << endl;

    return 0;
}