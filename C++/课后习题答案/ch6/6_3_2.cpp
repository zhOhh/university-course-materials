//6_3_2

#include "multab.h"

void multab2()
{
  cout <<"  *";
  for(int i=1; i<=9; i++)
    cout <<setw(4) <<i;
  cout <<"\n-----------------------------------------\n";

  for(int i=1; i<=9; i++){
    cout <<setw(3) <<i;
    for(int j=1; j<=i; j++)
      cout <<setw(4) <<i*j;
    cout <<endl;
  }
  cout <<endl <<endl;
}

