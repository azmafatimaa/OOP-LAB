public class MemberCardDemo{

public static void main (String[] args) {

	MemberCard m1 = new MemberCard();
	
	MemberCard m2 = new MemberCard("Ali");
	MemberCard m3 = new MemberCard("Sana" , "BBA");
	
	MemberCard m4 = new MemberCard("Azma" , "BSSE", 2, 300 , true );
	MemberCard m5 = new MemberCard( "Minahil" , "BSMM" , 2, 200 , false );

	MemberCard m6 = new MemberCard(m4);

	m2.payFee(200);
	m4.deactivateCard();
	m3.activateCard();

	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);
	System.out.println(m4);
	System.out.println(m5);
	System.out.println(m6);

	System.out.println("Total Cards Created:" + MemberCard.getTotalCards());


}












}