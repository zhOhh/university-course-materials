//*********************
//**    ch7_9.cpp    **
//*********************

#include <iostream.h>

void bubble(int[],int);

void main()
{
  int array[]={55,2,6,4,32,12,9,73,26,37};
  int len=sizeof(array)/sizeof(int);    //Ԫ�ظ���
  for(int i=0; i<len; i++)              //ԭʼ˳�����
    cout <<array[i] <<",";

  cout <<endl<<endl;
  bubble(array, len);      //����������
}

void bubble(int a[],int size)    //ð������
{
  int i,temp;

  for(int pass=1; pass<size; pass++){    //���Ƚ�size-1��
    for(i=0; i<size-pass; i++)           //�Ƚ�һ��
      if(a[i]>a[i+1]){
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
      }

    for(i=0; i<size; i++)    //�Ƚ�һ�ֺ�����
      cout <<a[i] <<",";
    cout <<endl;
  }
}
