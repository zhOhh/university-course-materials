//**********************
//**    ch16_3.cpp    **
//**********************

#include<iostream.h>��
#include<math.h>����

class Shape��
{��
  ��public:��
    Shape(double x, double y) :xCoord(x), yCoord(y){}��
    ��WT5��BKH��virtual��WT5��BKB�� double Area() const {return 0.0;}��
��  protected:��
    double xCoord, yCoord;��
};����

class Circle :public Shape��
{��
  ��public:��
    Circle(double x, double y, double r) :Shape(x, y), radius(r){}��
    ��WT5��BKH��virtual��WT5��BKB�� double Area() const {return 3.14*radius*radi
us;}��
��  protected:��
    double radius;��
};����

class Rectangle :public Shape��
{��
  ��public:��
    Rectangl��ZK(��e(double x1, double y1, double x2, double y2)��
            :Shape(x1,y1), x2Coord(x2), y2Coord(y2){}��ZK)����
    [WT5��BKH]virtual��WT5��BKB�� double Area() const;��
��  protected:��
    double x2Coord, y2Coord;��
};����

double Rectangle��Area() const��
{��
��  return fabs((xCoord-x2Coord)*(yCoord-y2Coord));��
}����

void fun(const Shape& sp)��
{��
��  cout <��KG-��2��<sp.Area() <��KG-��2��<endl;��
}����

void main()��
{��
  ��Circle c(2.0,5.0,4.0);��
  ��fun(c);��
  ��Rectangle t(2.0,4.0,1.0,2.0);��
  ��fun(t);��
}