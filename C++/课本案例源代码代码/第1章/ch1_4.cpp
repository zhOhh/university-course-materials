//*********************
//**    ch1_4.cpp    **
//*********************

#include <iostream.h>
#include <math.h>

double max(double x,double y)  //max()�������壬ͬʱҲ�Ǻ�������
{
  if(x>y)
    return x;
  else
    return y;
}

void main()
{
  double a,b,c;
  cout <<"input two numbers:\n";
  cin >>a >>b;

  c=max(a,b);

  cout <<"the squart of maximum =" <<sqrt(c);
}