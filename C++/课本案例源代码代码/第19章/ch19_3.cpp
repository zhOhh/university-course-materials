//**********************
//**    ch19_3.cpp    **
//**********************

#include<iostream.h>
#include<strstrea.h>

char* parseString(char* pString)
{
  istrstream inp(pString,0);          //ios::in��ʽ������Null����
  int aNumber;
  float balance;
  inp >>aNumber >>balance;            //�Ӵ����ж���һ�������͸�����  char* pBuffer =new char[128];
  ostrstream outp(pBuffer,128);       //ios::out��ʽ���ִ�����128
  outp <<"a Number = " <<aNumber       //д��pBuffer��       <<", balance = " <<balance;
  return pBuffer;
}

void main()
{
  char* str ="1234 100.35";
  char* pBuf =parseString(str);
  cout <<pBuf <<endl;
  delete[]pBuf;
}
