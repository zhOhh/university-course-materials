//*********************
//**    ch8_3.cpp    **
//*********************

#include <iostream.h>

void main()
{
  float f=34.5;
  float* fPtr=&f;         //����ָ��

  int* iPtr=(int*)&f;     //warning: ����������ĵ�ַ��������ָ��

  cout <<f <<endl
       <<"iPtr:" << iPtr <<"=>" <<*iPtr <<endl
       <<"fPtr:" << fPtr <<"=>" <<*fPtr <<endl <<endl;

  *iPtr=*fPtr;            //��ʽ����ת��

  cout <<f <<endl
       <<*iPtr <<endl
       <<*fPtr <<endl;
  cin.get();
}
