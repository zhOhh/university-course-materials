//********************
//**    master.h    **
//********************

#include "student.h"
#include <iostream.h>

//˶ʿ����
class MasterStudent: public Student{
public:
  MasterStudent(char* pS, unsigned num, float g, char t)
    :Student(pS,num,g),type(t){}
  void display(ostream& out);
protected:
  char type;
};
