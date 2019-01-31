
public class Customer {
	String cstname;
	String cstadress;
	int cstphone;
	String cstEmail;
    Products pref;
 void setDataForCustomer(String cn,int cp,String ca,String ce) {
	 cstEmail = ce;
	 cstphone = cp ;
	 cstadress = ca;
	 cstname = cn;
	
 }
 void showDataForCustomer() {
	 System.out.println("****Customer Details *****");
	 System.out.println("name="+cstname);
	 System.out.println("phonenumber="+cstphone);
	 System.out.println("email"+cstEmail);
	 System.out.println("adress="+cstadress);
	 pref.showDataForProduct(); 
 }
 
}
