//**********************
//**    master.cpp    **
//**********************

#include <iostream.h>
#include "master.h"

void MasterStudent::display(ostream& out)
{
  Student::display(out);
  out <<", " <<type;
}
