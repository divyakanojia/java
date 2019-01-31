//Application class
public class Product {

	public static void main(String[] args) {
		Products p1= new Products();
		Customer c1= new Customer();
		c1.setDataForCustomer("mark", 458,"bhjufnjf","mark@gmail.com");
		p1.setDataForProduct(1,555,"choclate");
		
	    c1.pref = p1;
	    c1.showDataForCustomer();
	}

}
