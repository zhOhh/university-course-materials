//**********************��
//**    ch11_2.cpp    **��
//**********************����
#include <iostream.h>
#include "tdate.h"
void someFunc(Tdate* pS)
{
  pS->Print();  //pS��s�����ָ��
  if(pS->IsLeapYear())
    cout <<"oh oh\n";
  else
    cout <<"right\n";
}
void main()
{
  Tdate s;
  s.Set(2,15,1998);
  someFunc(&s);    //����ĵ�ַ����ָ��
}
