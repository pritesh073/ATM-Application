#include <iostream>

using namespace std;

int main()
{
    int choice,balance, userpin, pin, Withdraw_amount,new_pin,confirm_pin, Deposit_amout,old_pin;
    pin=1333;
    balance=50000;
    do
    {
     cout<<"\n*WELCOME TO SBI ATM*\n";
     cout<<" 1.check balance\n 2.Debit/Withdraw Cash\n 3.Credit/Deposit\n 4.Change Pin\n 5.Exit\n";
     cout<<" Enter your choice:";
     cin>>choice;
     
     switch(choice)
     {
         case 1:
         cout<<"Enter Your Pin:";
         cin>>userpin;
         
         if(userpin==pin)
         {
             cout<<"Your balance is:"<<balance;
         }
         else
         {
             cout<<"invalid pin.....";
         }
         
         break;
         
          case 2:
          cout<<"Enter Your Pin:";
          cin>>userpin;
          if(userpin==pin)
           {
             cout<<"Enter the amount to Withdraw:";
             cin>>Withdraw_amount;
             if(Withdraw_amount<balance)
             {
                 balance = balance - Withdraw_amount;
                 cout<<" Transaction Successfull..\n";
                 cout<<"Available balance:"<<balance;
             }
             else
             {
                 cout<<"Insufficient balance\n";
             }
            } 
          else
          {
              cout<<"invalid pin";
          }
         break;
         
          case 3:
           cout<<"Enter Your Pin:";
           cin>>userpin;
           if(userpin == pin)
          { 
              cout<<"Enter the amount to be deposited ";
              cin>>Deposit_amout;
              if(Deposit_amout>0)
              {
                 balance = Deposit_amout+balance;
                 cout<<" Amount deposited Successfull..\n";
                 cout<<"Available balance: "<<balance;
                
              }
              else
              {
                  cout<<"Enter amount is not valid";
              }
              
          }
          else
              {
                  cout<<"invalid pin ";
              }
          
         break;
         
          case 4:
          cout<<"Enter Your old Pin:";
          cin>>pin;
          if(pin == 1333)
          {
          cout<<"Enter Your new pin";
          cin>>new_pin;
          cout<<"Enter Your confirm pin";
          cin>>confirm_pin;
          if(new_pin == confirm_pin)
          {
              pin=new_pin;
              cout<<"New Pin set Successfull";
          }
          else
          { 
              cout<<"invalid new pin";
          }
          
          }
          else
          {
              cout<<"invalid old pin";
          }
         break;
         
          case 5:
          cout<<"Thank You";
         break;
        
     }
     
    }
    while(choice!=5);
    return 0;
}