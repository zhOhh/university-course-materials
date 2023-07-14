//**********************
//**    ch15_4.cpp    **
//**********************

#include <iostream.h>
#include <string.h>

class Student{
public:
  Student(char* pName);
  ~Student();
protected:
  static Student* pFirst;
  Student* pNext;
  char name[40];
};

Student* Student::pFirst =0;
Student::Student(char* pName)
{
  strncpy(name,pName,sizeof(name));
  name[sizeof(name)-1] ='\0';
  pNext =pFirst;          //ÿ�½�һ�����(����),�ͽ����������
  pFirst =this;
}
Student::~Student()
{
  cout <<this->name <<endl;
  if(pFirst==this){       //���Ҫɾ�����׽��,��ֻҪ����ָ��ָ����һ��
    pFirst=pNext;
    return;
  }
  for(Student* pS=pFirst; pS; pS=pS->pNext)
    if(pS->pNext==this){  //�ҵ�ʱ,pSָ��ǰ���Ľ��
      pS->pNext=pNext;    //pNext��this->pNext
      return;
    }
}
Student* fn()
{
  Student* pS =new Student("Jenny");
  Student sb("Jone");
  return pS;
}

void main()
{
  Student sa("Jamsa");
  Student* sb =fn();
  Student sc("Tracey");
  delete sb;
}
