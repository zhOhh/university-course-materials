//*********************
//**    ch8_4.cpp    **
//*********************

#include <iostream.h>

void main()
{
  int iArray[10];
  int sum=0;
  int* iPtr=iArray;    //��������iArray��ָ���ʼ��

  for(int i=0;i<10;i++)    //�����鸳ֵ
    iArray[i]=i*2;

  for(int index=0; index <10; index++){    //��������Ԫ��֮��
    sum+= *iPtr;
    iPtr++;
  }
  cout <<"sum is " <<sum <<endl;
}
