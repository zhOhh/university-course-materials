//*********************
//**    ch4_8.cpp    **
//*********************

#include <iostream.h>
#include <iomanip.h>
#include <math.h>

void main()
{
  //����
  long a,b,l=0;
  cout <<"please input two numbers:\n";
  cin >>a >>b;
  cout <<"primes from " <<a <<" to " <<b <<" is:\n";

  //����
  if(a%2==0)    //��Ϊż��������1
    a++;

  for(long m=a; m<=b; m+=2){   //����Ϊ2
    int sqrtm=sqrt(m);
    int i;
    for(i=2; i<=sqrtm; i++)    //��������
      if(m%i==0)
        break;
    //���
    if(i>sqrtm){    //����
      if(l++%10==0)
        cout <<endl;
      cout <<setw(5) <<m;
    }
  }
}
