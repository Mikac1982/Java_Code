package com.ReviewClass11;

public class Marketing {
   /* Create a class called Marketing with fields of employeeName, productName,
    * and saleAmount. 
    * In your Test class have a collection of 10 marketing employees
    * and print those who achieved more than $3000 in sales. 
    */
	
	private String empName;
	private String prodName;
	private double saleAmount;

	public Marketing(String empName,String prodName, int saleAmount ) {
		this.empName=empName;
		this.prodName=prodName;
		this.saleAmount=saleAmount;	
	}
	/*
	@Override
	public String toString() {
		return "Marketing [empName=" + empName + ", prodName=" + prodName + ", saleAmount=" + saleAmount + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}
*/
	
	
	 public void printSale() {
	        if(saleAmount>3000) {
	            System.out.println("Employe "+empName+" achived "+saleAmount+" in sale of "+prodName);
	        }
	
	
	 }
}
