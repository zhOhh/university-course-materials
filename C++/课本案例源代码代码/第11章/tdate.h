//*******************
//**    tdate.h    **
//*******************
#ifndef TDATE
#define TDATE

class Tdate{
public:
  void Set(int,int,int);      //��Ա��������
  int IsLeapYear();
  void Print();
private:
  int month;
  int day;
  int year;
};

#endif
