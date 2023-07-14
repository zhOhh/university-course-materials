//**********************
//**    ch16_2.cpp    **
//**********************

#include<iostream.h>
class Base{
public:
  virtual void fn()
  {
    cout <<"In Base class\n";
  }
};

class SubClass :public Base{
public:
  virtual void fn()
  {
    cout <<"In SubClass\n";
  }
};

void test(Base& b)
{
  b.fn();
}

void main()
{
  Base bc;
  SubClass sc;
  cout <<"Calling test(bc)\n";
  test(bc);
  cout <<"Calling test(sc)\n";
  test(sc);
}
