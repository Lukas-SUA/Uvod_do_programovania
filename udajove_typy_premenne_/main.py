'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
global earth_radius    # globálna premenná
earth_radius = 6378
global glob_sum         # globálna premenná 
glob_sum = 0

def aandb(a,b):
    suma = a + b
    return suma

k2c = -273.15           # lokálna premenná
    
glob_sum = aandb(5,6);  # pouzitie funkcie 
	                    # a navrat hodnoty do globalnej premennej
    
print("Polomer zeme: " + str(earth_radius) + "km")
print("Kelvin na °C: " + str(k2c))
print("Sucet je: " + str(glob_sum))
