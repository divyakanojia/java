public class Products {
   int prdctId;
   String prdctName;
   int prdctQuant;

   //method
   void setDataForProduct(int pq,int id,String pn) {
	  prdctId=id;
	  prdctName=pn;
	  prdctQuant=pq;
	 
	  }
   void showDataForProduct() {
	   System.out.println("*****Product Details*******");
	   System.out.println("product id ="+prdctId);
	   System.out.println("product name="+prdctName);
	   System.out.println("product quantity="+prdctQuant);
	   
   }
}

