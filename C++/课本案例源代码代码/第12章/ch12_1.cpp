//**********************
//**    ch12_1.cpp    **
//**********************
#include <iostream.h>

class Desk{
public:
  Desk();          //���캯������
protected:
  int weight;
  int high;
  int width;
  int length;
};

class Stool{
public:
  Stool();    //���캯������
protected:
  int weight;
  int high;
  int width;
  int length;
};

Desk::Desk()    //���캯������
{
  weight=10;
  high=5;
  width=5;
  length=5;
  cout <<weight <<" " <<high <<" "       <<width <<" " <<length <<endl;}

Stool::Stool()    //���캯������
{
  weight=6;
  high=3;
  width=3;
  length=3;
  cout <<weight <<" " <<high <<" "       <<width <<" " <<length <<endl;}

void fn()
{
  Desk da;    //�Զ�����Desk()
  Stool sa;   //�Զ�����Stool()
}

void main()
{
  fn();
}
