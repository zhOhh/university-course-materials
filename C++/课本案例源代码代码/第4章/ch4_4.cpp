//*********************
//**    ch4_4.cpp    **
//*********************

#include <iostream.h>
#include <iomanip.h>
#include <math.h>

void main()
{
  double s=0,x=1;  //��ʼֵ
  long k=1;
  int sign=1;

  while(fabs(x)>1e-8){   //��ֵ�ڱȽ�ǰҪ�������ֵ
    s += x;
    k += 2;
    sign *= -1;
    x = sign/double(k);  //ǿ��ת��ʹx�õ�������ֵ
  }

  s *= 4;                //��ֵ
  cout <<"the pi is "    //���
       <<setiosflags(ios::fixed)
       <<setprecision(8)
       <<s <<endl;
}
