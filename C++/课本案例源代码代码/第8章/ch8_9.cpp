//*********************
//**    ch8_9.cpp    **
//*********************

#include <iostream.h>
//#include <alloc.h>    //����ͷ�ļ�

void main()
{
  int arraysize;    //Ԫ�ظ���
  int *array;
  cout <<"please input a number of array:\n";
  cin >>arraysize;

  if((array=new int[arraysize])==NULL){    //������ڴ�
    cout <<"can't allocate more memory, terminating.\n";
    return ;
  }

  for(int count=0; count<arraysize; count++)
    array[count]=count*2;

  for(int count=0; count<arraysize; count++)
    cout <<array[count] <<"  ";

  cout <<endl;
  delete[]array;        //�ͷŶ��ڴ�
}
