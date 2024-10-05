public class Book{
	public static String company;
	public int noOfPages;
	public String pageView;
	public static void main(String[] args){
	Book details = new Book();
	details.company = "Arka";
	details.noOfPages = 150;
	details.pageView = "Ruled";
	System.out.println("Book company:"+details.company);
	System.out.println("No of Pages in Book:"+details.noOfPages);	
	System.out.println("pages view:"+details.pageView);
	
	}
}