//*********************
//**    ch4_9.cpp    **
//*********************

#include <iostream.h>
#include <iomanip.h>
#include <math.h>

double f(double x);

void main()
{
  int n=1;     //��ֵ
  double a=0, b=1;
  double h,Tn,T2n,In,I2n;

  const double eps=1e-8;

  h = b-a;
  T2n=I2n=h*(f(a)+f(b))/2;
  In=0;

  while(fabs(I2n-In)>=eps){    //�����
    Tn=T2n;
    In=I2n;

    double sigma=0.0;
    for(int k=0; k<n; k++){    //��䲽�����εĺͲ���
      double x=a+(k+0.5)*h;
      sigma+=f(x);
    }

    T2n=(Tn+h*sigma)/2.0;      //�䲽������
    I2n=(4*T2n-Tn)/3.0;        //��������ʽ

    n*=2;      //����
    h/=2;
  }

  cout <<"the integral of f(x) from "
       <<a <<" to " <<b <<" is \n"
       <<setiosflags(ios::fixed)
       <<setprecision(8)
       <<setw(10) <<I2n <<endl;    //������
}

double f(double x)
{
  return exp(x)/(1+x*x);
}