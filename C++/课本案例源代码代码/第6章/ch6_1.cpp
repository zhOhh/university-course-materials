//*********************
//**    ch6_1.cpp    **
//*********************

#include <iostream.h>

void fn1();
void fn2();
int n;

void main()
{
  n=3;
  fn1();         //fn1()�����Ķ����ڱ��ļ���
  cout <<n <<endl;
}

void fn1()
{
  fn2();         //fn2()�����Ķ��岻�ڱ��ļ���
}
