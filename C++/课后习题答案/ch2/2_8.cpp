//----------------------------------------
#include <iostream.h>
#include <math.h>
//----------------------------------------
double Cylinder(double r, double h);
//----------------------------------------
void main()
{
  double radius, height;
  cout <<"������Բ����İ뾶�͸�:\n";
  cin >>radius >>height;

  double volume = Cylinder(radius, height);

  cout <<"��Բ��������Ϊ��" <<volume <<endl;
}
//----------------------------------------
double Cylinder(double r, double h)
{
  return r*r*M_PI*h;
}
//----------------------------------------

