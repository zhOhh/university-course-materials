//cat.h
#ifndef CAT
#define CAT

#include <iostream.h>

class Cat{
public:
  int GetAge();
  void SetAge(int age);
  void Meow();         //������
protected:
  int itsAge;
};

#endif
