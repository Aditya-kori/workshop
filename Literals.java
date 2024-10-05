public class Literals{
	public static void main(String[] args){
	String phoneName = "moto";
	String learningTopis = "string methods";
	String message = "Good evening";
	String fromType = "Feedback";
	String issuedBy = "Training Cell";
	String messageContinued = " Sir";
	String phone = new String("moto");
	String specification =new String("tab type");
	String penname = new String("Ox");
	String inkColour = new String("Black");
	String penType = new String(" Ball pen");
	String empty = "";



	System.out.println(phoneName.toLowerCase());
	System.out.println(learningTopis.toUpperCase());
	System.out.println(phoneName.equals(phone));
	System.out.println(message.charAt(4));
	System.out.println(penname.concat(penType));
	System.out.println(message.length());
	System.out.println(empty.isEmpty());

}
}