//************************
//**    checking.cpp    **
//************************

#include <iostream.h>
#include "account.h"
#include "checking.h"

Checking::Checking(unsigned accNo, float balan)
  :Account(accNo, balan){ remittance=other; }

void Checking::Withdrawal(float amount)
{
  float temp=amount;                //���Ż㡢�����㷽ʽ������������
  if(remittance==remitByPost)        //���Ż㣬�����30Ԫ������
    temp=amount+30;
  else if(remittance==remitByCable)  //����㣬�����60Ԫ������
    temp=amount+60;

  if(balance<temp)
    cout <<"Insufficient funds:balance withdrawal: " <<temp <<endl;
  else
    balance-=temp;
	Display();
}

void Checking::SetRemit(REMIT re){ remittance=re; }
