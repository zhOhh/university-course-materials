//*********************
//**    listtmp.h    **
//*********************
#ifndef LIST
#define LIST

#include <iostream>

template<class T> class List{
public:
  List();
  void Add(T&);
  void Remove(T&);
  T* Find(T&);
  void PrintList();
  ~List();
protected:
  struct Node{
    Node* pNext;
    T* pT;
  };
  Node *pFirst;        //���׽��ָ�몤
};

template<class T> List<T>::List()
{
  pFirst = 0;
}

template<class T>
void List<T>::Add(T& t)
{
  Node* temp = new Node;             //��
  temp->pT =&t;                      //��
  temp->pNext = pFirst;              //��
  pFirst = temp;                     //��
}

template<class T>
void List<T>::Remove(T& t)
{
  Node *q = 0;                       //������λ��ɾ�Ľ��
  if(*(pFirst->pT)==t){              //T����==���ж���    q = pFirst;
    pFirst = pFirst->pNext;          //��ɾ���������ʱ������
  }else{
    for(Node* p=pFirst; p->pNext; p=p->pNext)   //˳������      if(*(p->pNext->pT)==t){
        q = p->pNext;
        p->pNext = q->pNext;           //��
        break;
      }
  }
  if(q){
    delete q->pT;                     //��
    delete q;                         //��
  }
}

template<class T>
T* List<T>::Find(T& t)
{
  for(Node* p=pFirst; p; p=p->pNext)
    if(*(p->pT)==t)
      return p->pT;

  return 0;
}

template<class T>
void List<T>::PrintList()
{
  for(Node* p=pFirst; p; p=p->pNext)
    cout <<*(p->pT)<<" ";             //����T����Ԫ����T�������
  cout <<endl;
}

template<class T>
List<T>::~List()
{
  Node* p;
  while(p = pFirst){
    pFirst = pFirst->pNext;
    delete p->pT;
    delete p;
  }
  pFirst = 0;
}

#endif

