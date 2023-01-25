class Bank
{
 public static void main(String[] args)
  {
	Bank manager= new Bank();
	manager.approveAllLoans();
	double cash = manager.recover();
	System.out.println("The recover amnt :"+cash);
	manager.getReward(50);
  }
 void approveAllLoans()
  {
	System.out.println("approve loans");
  }
 double recover()
  {

	return 1000.0;
  }
 void getReward(int money)
  {
	System.out.println("Got  " +money);
  }
}	
