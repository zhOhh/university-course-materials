//**********************
//**    ch8_26.cpp    **
//**********************

#include <iostream.h>

typedef void (*MenuFun)();    //声明函数指针类型
void f1(){ cout <<"\ngood!\n"; }
void f2(){ cout <<"\nbetter!\n"; }
void f3(){ cout <<"\nbest!\n"; }

MenuFun fun[]={f1,f2,f3};    //全局函数指针数组

void main()
{
  int choice;
  do{
    cout <<"1 display good\n"
         <<"2 dispaly better\n"
         <<"3 dispaly best\n"
         <<"0 exit\n"
         <<"Enter your choice: ";
    cin >>choice;
    switch(choice){
      case 1: fun[0]();  break;
      case 2: fun[1]();  break;
      case 3: fun[2]();  break;
      case 0: return;
      defaut:cout<<"you entered a wrong key.\n";
    }
  }while(choice);
}
