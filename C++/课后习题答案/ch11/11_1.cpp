//11_1

#include <math.h>

class Point{
public:
  void Set(double ix,double iy)     //��������
  {��
      x=ix;  y=iy;
  }

  double xOffset()                  //ȡy���������
  {
    return x;
  }

  double yOffset()                  //ȡx���������
  {
    return y;
  }

  double angle()                    //ȡ��ļ������
  {
    return (180/3.14159)*atan2(y,x);
  }

  double radius()                   //ȡ��ļ�����뾶
  {
    return sqrt(x*x+y*y);
  }
protected:
  double x;                         //x�����
  double y;                         //y�����
}           //error: ȱ�ٷֺ�

void main()
{
  Point p;
  double x,y;

  cout <<"Enter x and y:\n";
  cin >>x >>y;

  p.Set(x,y);
  p.x+=5;   //error: ˽�г�Ա���������ⱻ����
  p.y+=6;   //error: ͬ��

  cout <<"angle=" <<p.angle()
       <<",radius=" <<p.radius()
       <<",x offset=" <<p.xOffset()
       <<",y offset=" <<p.yOffset() <<endl;}