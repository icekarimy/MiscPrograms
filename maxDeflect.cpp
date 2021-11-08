/* 
* description: a program that outputs a physics calculation for Deflection.
*/

#include "stdafx.h"
#include <iostream>
#include <math.h>
using namespace std;

double maxDeflect(double weight, double length, double elasticity, double base, double height);

int main()
{
	double loadWeight = 1000;
	double beamLength = 3;
	double elasticityAluminum = 1.49e9;
	double elasticityPineWood = 0.187e9;
	double elasticitySteel = 3.9e9;
	double beamBase = 0.2;
	double beamHeight = 0.3;

	cout << "The max deflection (in) of Aluminum is " 
		<< maxDeflect(loadWeight, beamLength, elasticityAluminum, beamBase, beamHeight) << endl;
	cout <<"The max deflection(in) of Pine Wood is " 
		<< maxDeflect(loadWeight, beamLength, elasticityPineWood, beamBase, beamHeight) << endl;
	cout << "The max deflection (in) of Steel is " 
		<< maxDeflect(loadWeight, beamLength, elasticitySteel, beamBase, beamHeight) << endl;

	cin.ignore(2);
    return 0;
}

double maxDeflect(double weight, double length, double elasticity, double base, double height) 
{
	double result;
	
	result = (4 * weight * pow(length, 3)) / (elasticity*base*pow(height, 3));

	return result;
}

