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

Student* head;    //����ָ��

Student* Create()
{
  Student* pS;        //�����Ľ��ָ��
  Student* pEnd;      //��βָ�룬����������������
  pS=new Student;     //�½�һ����㣬׼����������
  cin >>pS->number >>pS->score;    //����㸳ֵ
  head=NULL;          //һ��ʼ����Ϊ��
  pEnd=pS;
  while(pS->number!=0){
    if(head==NULL)
      head=pS;
    else
      pEnd->next=pS;

    pEnd=pS;        //s��
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
