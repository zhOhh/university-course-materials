//*********************
//**    ch4_5.cpp    **
//*********************

#include <iostream.h>
#include <math.h>

void main()
{
  double s=0,x=1;   //��ʼֵ
  for(int n=1; fabs(x)>1e-8; n++,x*=(-1.0)*(2*n-3)/(2*n-1))
    s += x;

  s*=4;   //��ֵ
  cout <<"the pi is " <<s <<endl;  //���
}
