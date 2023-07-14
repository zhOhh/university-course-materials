#include <iostream.h>
#include <typeinfo.h>

class Father{
public:
  Father(){ cout <<"father is created.\n"; }
	void DoWork(){ DriveACar(); }
	void DoMannulWork(){ RepairTV(); }
  void DriveACar() {  cout <<&typeid(*this).name()[6] <<" Drive a car.\n";  }
protected:
  void RepairTV() {  cout <<&typeid(*this).name()[6] <<" Repair a TV set.\n";  }
};

class Mother{
public:
  Mother(){ cout <<"mother is created.\n"; }
  void SingASong() {  cout <<&typeid(*this).name()[6] <<" Sing a song.\n";  } 
  void DoWork(){ SingASong();  }                                                    //��ʽ��
  void DoMannulWork() { cout <<&typeid(*this).name()[6] <<" Do mannul work.\n"; }   //С��
};

class Boy : public Father, public Mother{
public:
  Boy(){ cout <<"boy is created.\n"; }
  void RepairTV(){ cout <<"boy "; Father::RepairTV(); }
	void SingASong(){ cout <<"boy "; Mother::SingASong(); }
  void PlayPingPong() { cout <<&typeid(*this).name()[6] <<" Play pingpong.\n";  };
};

void main()
{
   Father father;
   Mother mother;
   Boy boy;

   father.DoWork();
   mother.DoWork();
   mother.DoMannulWork();

   boy.PlayPingPong();
   boy.DriveACar();
   boy.SingASong();

   father.DoMannulWork();
   boy.RepairTV();
}

//�޸�class Father
//void RepairTV(); ��Ϊpublic
