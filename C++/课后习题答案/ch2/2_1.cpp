#include <iostream.h>

void main()
{
  //����ԭ������16λ������ʵ��Ŀǰ��Ϊ32λ���������ѹ�ʱ��
  int a = 42486;
  cout <<oct <<a <<endl
       <<hex <<a <<endl;
  unsigned b = 42486;
  cout << dec <<(signed)b <<endl;
}
