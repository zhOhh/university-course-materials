//*********************
//**    ch4_6.cpp    **
//*********************

#include <iostream.h>

void main()
{
  //����
  long m;
  cout <<"please input a number:\n";
  cin >>m;

  //����
  int i;
  for(i=2; i<m; i++)    //��m������
    if(m%i==0)
      break;

  //���
  if(m==i)  //�ж�m�Ƿ�С��m��������
    cout <<m <<" is prime.\n";
  else
    cout <<m <<" isn't prime.\n";
}
