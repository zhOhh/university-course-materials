//*********************
//**    ch4_6.cpp    **
//*********************

#include <iostream.h>

void main()
{
  //输入
  long m;
  cout <<"please input a number:\n";
  cin >>m;

  //处理
  int i;
  for(i=2; i<m; i++)    //找m的因数
    if(m%i==0)
      break;

  //输出
  if(m==i)  //判断m是否被小于m的数整除
    cout <<m <<" is prime.\n";
  else
    cout <<m <<" isn't prime.\n";
}
