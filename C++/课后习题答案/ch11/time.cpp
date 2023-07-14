//time.cpp

#include "time.h"
#include <iostream.h>
#include <iomanip.h>

void Time::Set(int h, int m, int s)
{
  h%=24; m%=60; s%=60;  //����ȷ�Դ���
  hour=h; minute=m; second=s;
}

void Time::Display()
{
  cout <<setfill('0')
       <<setw(2) <<hour <<":"
       <<setw(2) <<minute <<":"
       <<setw(2) <<second <<endl;
  cout <<setfill(' ');
}
