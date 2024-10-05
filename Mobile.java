public class Mobile{
	public String mobileName;
	public String brandName;
	public static void main(String[] args){
	Mobile mobile = new Mobile();
	System.out.println("mobile:"+mobile);
	mobile.mobileName = "Samsung M21";
	System.out.println("mobileName:"+mobile.mobileName);
	mobile.brandName = "Samsung";
	System.out.println("brandName:"+mobile.brandName);
	Mobile iphone = new Mobile();
	System.out.println("mobile:"+iphone);
	iphone.mobileName = "iphone 13";
	System.out.println("mobileName:"+iphone.mobileName);
	iphone.brandName = "Apple";
	System.out.println("brandName:"+iphone.brandName);
	Mobile laptop = new Mobile();
	System.out.println("mobile:"+laptop);
	Mi inmi=new Mi();
	inmi.name="yallu";
	inmi.mi();
	}
}