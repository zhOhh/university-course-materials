//**********************
//**    ch15_5.cpp    **
//**********************

#include <iostream.h>

class Student{
public:
  static int number()
  {
    return noOfStudents;
  }
  //...��
protected:
  char name[40];
  static int noOfStudents;
};
int Student::noOfStudents = 1;
void main()
{
  Student s;
  cout <<s.number() <<endl;          //ok �ö������þ�̬��Ա����  cout <<Student::number() <<endl;   //ok ������������̬��Ա����}