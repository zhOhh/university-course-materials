//2_6f
#include <iostream.h>
#include <iomanip.h>
#include <math.h>

float area(float a, float b, float c); //��������

void main()
{
  float a,b,c;
  cout <<"please input 3 sides of one triangle:\n";
  cin >>a >>b >>c;   //����ʱ�Կո���Ϊ���ݼ��

  float result = area(a,b,c);          //��������

  cout <<setiosflags(ios::fixed) <<setprecision(2)
       <<"a=" <<setw(7) <<a
       <<",b=" <<setw(7) <<b
       <<",c=" <<setw(7) <<c <<endl;
  cout <<"area of triangle is " <<setw(10)
       <<setprecision(5) <<result <<endl;
}

float area(float a, float b, float c)  //��������
{
  float s=(a+b+c)/2;
  return sqrt(s*(s-a)*(s-b)*(s-c));
}

