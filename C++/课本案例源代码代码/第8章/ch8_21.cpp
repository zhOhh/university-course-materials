//**********************
//**    ch8_21.cpp    **
//**********************

#include <iostream.h>

void Print(char*[]);

void main()
{
  char* pn[]={"Fred","Barney","Wilma","Betty",NULL};
  Print(pn);
}

void Print(char* arr[])
{
  while(*arr!=NULL){    //������ַ���
    cout <<(int)*arr <<"    "
         <<*arr <<endl;
    arr++;
  }
}
