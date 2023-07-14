//**********************
//**    ch21_3.cpp    **
//**********************

#include <iostream.h>
#include <string.h>

class String{
public:
  String(char*, int);
  class Range{        //�쳣��1
  public:
    Range(int j):index(j){}
    int index;
  };
  class Size{};       //�쳣��2

  char& operator[](int k)
  {
    if(0<=k && k<len)
      return p[k];
    throw Range(k);
  }
private:
  char* p;
  int len;
  static int max;
};

int String::max = 20;

String::String(char* str, int si)
{
  if(si<0 || max<si)
    throw Size();

  p=new char[si];
  strncpy(p, str, si);
  len=si;
}

void g(String& str)
{
  int num=10;
  for(int n=0; n<num; n++)
    cout <<str[n];
  cout <<endl;
}

void f()
{
  //������1����

  try{
    //������2����
    String s("abcdefghijklmnop", 10);
    g(s);
  }
  catch(String::Range r)
  {
    cerr <<"->out of range: " <<r.index <<endl;    //������3
  }
  catch(String::Size)
  {
    cerr <<"size illegal!\n";
  }
  cout <<"The program will be continued here.\n\n";
  //������4
}

void main()
{
  //������5
  f();
  cout <<"These code is not effected by probably exception in f().\n";}