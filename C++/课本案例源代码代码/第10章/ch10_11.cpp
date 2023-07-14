//***********************
//**    ch10_11.cpp    **
//***********************

#include <iostream.h>

struct Student
{
  long number;
  float score;
  Student* next;
};

Student* head;    //链首指针

Student* Create()
{
  Student* pS;        //创建的结点指针
  Student* pEnd;      //链尾指针，用于在其后面插入结点
  pS=new Student;     //新建一个结点，准备插入链表
  cin >>pS->number >>pS->score;    //给结点赋值
  head=NULL;          //一开始链表为空
  pEnd=pS;
  while(pS->number!=0){
    if(head==NULL)
      head=pS;
    else
      pEnd->next=pS;

    pEnd=pS;        //s点
    pS=new Student;
    cin >>pS->number >>pS->score;
  }
  pEnd->next=NULL;
  delete pS;
  return(head);
}

void ShowList(Student* head)
{
  cout <<"now the items of list are \n";

  while(head){
    cout <<head->number <<"," <<head->score <<endl;
    head=head->next;
  }
}

void main()
{
  ShowList(Create());
}
