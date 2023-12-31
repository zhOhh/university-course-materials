//*********************
//**    ch7_9.cpp    **
//*********************

#include <iostream.h>

void bubble(int[],int);

void main()
{
  int array[]={55,2,6,4,32,12,9,73,26,37};
  int len=sizeof(array)/sizeof(int);    //元素个数
  for(int i=0; i<len; i++)              //原始顺序输出
    cout <<array[i] <<",";

  cout <<endl<<endl;
  bubble(array, len);      //调用排序函数
}

void bubble(int a[],int size)    //冒泡排序
{
  int i,temp;

  for(int pass=1; pass<size; pass++){    //共比较size-1轮
    for(i=0; i<size-pass; i++)           //比较一轮
      if(a[i]>a[i+1]){
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
      }

    for(i=0; i<size; i++)    //比较一轮后就输出
      cout <<a[i] <<",";
    cout <<endl;
  }
}
