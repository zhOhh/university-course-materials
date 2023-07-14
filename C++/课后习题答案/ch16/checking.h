//**********************
//**    checking.h    **
//**********************

#ifndef CHECKING
#define CHECKING

#include "account.h"

enum REMIT{remitByPost,remitByCable,other}; //�ޣ��Ż㣬���

class Checking :public Account{
public:
  Checking(unsigned accNo, float balan=0.0);
  virtual void Withdrawal(float amount);
  void SetRemit(REMIT re);
protected:
  REMIT remittance;
};

#endif
