//*********************
//**    ch8_6.cpp    **
//*********************

#include <iostream.h>

int sum1,sum2,sum3,sum4,sum5;    //���ÿ�ַ����Ľ��

int iArray[]={1,4,2,7,13,32,21,48,16,30};    //ȫ������
int* iPtr;

void main()
{
  int size,n;
  size=sizeof(iArray)/sizeof(*iArray);    //Ԫ�ظ���

  for(n=0; n<size; n++)      //����1
    sum1 += iArray[n];

  iPtr=iArray;
  for(n=0; n<size; n++)      //����2
    sum2 += *iPtr++;

  iPtr=iArray;       //�˾䲻��ʡ�ԣ���Ϊ����2�޸���iPtr
  for(n=0; n<size; n++)     //����3
    sum3 += *(iPtr+n);

  iPtr=iArray;      //�˾����ʡ�ԣ���Ϊ����3û���޸�iPtr
  for(n=0; n<size; n++)    //����4
    sum4 += iPtr[n];

  for(n=0; n<size; n++)    //����5
    sum5 += *(iArray+n);

  cout <<sum1 <<endl
       <<sum2 <<endl
       <<sum3 <<endl
       <<sum4 <<endl
       <<sum5 <<endl;
}
