//**********************
//**    ch7_10.cpp    **
//**********************

#include <iostream.h>

void isort(int* a, int size);

void main()
{
  int array[]={55,2,6,4,32,12,9,73,26,37};
  int len=sizeof(array)/sizeof(int);    //Ԫ�ظ���

  for(int i=0; i<len; i++)    //ԭʼ˳�����
    cout <<array[i] <<",";
  cout <<endl<<endl;

  isort(array, len);    //����������
}

void isort(int a[],int size)    //��������
{
  int inserter,index;
  for(int i=1; i<size; i++){    //��ִ��size-1��
    for(index=i-1,inserter=a[i]; index>=0 && inserter<a[index]; index--)
      a[index+1]=a[index];     //��Ųһ��λ��

    a[index+1]=inserter;       //����

    for(int j=0; j<size; j++)  //�Ƚ�һ�ֺ�����
      cout <<a[j] <<((j==i)?"  |  ":",");   //|Ϊ��������δ����ķֽ���
    cout <<endl;
  }
}