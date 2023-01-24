class Theatre
{
	public static void main(String[] args)
 {
	Theatre Ziavudeen = new Theatre();
	int balance=Ziavudeen.book_ticket(200);
	System.out.println("After booking ticket "+balance);
 }
	int book_ticket (int book_ticket)
 {
	int ticket_price=120;
	int balance = (book_ticket-ticket_price);
	return balance;
 }

}
