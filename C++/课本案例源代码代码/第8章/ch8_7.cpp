//*********************
//**    ch8_7.cpp    **
//*********************

#include <iostream.h>
#include <alloc.h>

void main()
{
  int arraysize;    //Ԫ�ظ���
  int *array;
  cout <<"please input a number of array:\n";
  cin >>arraysize;

  array =(int*)malloc(arraysize*sizeof(int));      //���ڴ����

  for(int count=0; count<arraysize; count++)
    array[count]=count*2;

  for(int count=0; count<arraysize; count++)
    cout <<array[count] <<"    ";

  cout <<endl;
}
