//**********************��
//**    ch11_1.cpp    **��
//**********************����
#include <iostream.h>

class Tdate{
public:
  void Set(int m,int d,int y)    //������ֵ
  {
    month=m; day=d; year=y;
  }

  int IsLeapYear()               //���Ƿ�����
  {
    return (year%4==0&&year%100!=0)||(year%400==0);
  }

  void Print()                   //�������ֵ
  {
    cout <<month <<"/" <<day <<"/" <<year <<endl;  }
private:
  int month;
  int day;
  int year;
};

void main()
{
  Tdate a;
  a.Set(2,4,1998);
  a.Print();
}
