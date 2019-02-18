import java.util.Scanner;
class labTest {
	 static void displayBakery(Bakery[] prod, int var) {
		for(int i=0; i<var; i++) {
			System.out.println("ItemId: \t"+prod[i].itemId+"\nProductName:\t"+prod[i].pName+"\nQuantity:\t"+prod[i].quantity+"\nPricePerItem:\t"+prod[i].pricePerItem+"\nCompanyName:\t"+prod[i].companyName+"\nManufacturingDate:\t"+prod[i].manuDate+"\nExpirydate:\t"+prod[i].expDate);
		}
	}
	static void displayPersonal(Personal[] prod, int var) {
		for(int i=0; i<var; i++) {
			System.out.println("ItemId: \t"+prod[i].itemId+"\nProductName:\t"+prod[i].pName+"\nQuantity:\t"+prod[i].quantity+"\nPricePerItem:\t"+prod[i].pricePerItem+"\nCompanyName:\t"+prod[i].companyName+"\nManufacturingDate:\t"+prod[i].manuDate+"\nExpirydate:\t"+prod[i].expDate);
		}
	}
	static void displayElectrical(Electrical[] prod, int var) {
		for(int i=0; i<var; i++) {
			System.out.println("ItemId: \t"+prod[i].itemId+"\nProductName:\t"+prod[i].pName+"\nQuantity:\t"+prod[i].quantity+"\nPricePerItem:\t"+prod[i].pricePerItem+"\nCompanyName:\t"+prod[i].companyName+"\nManufacturingDate:\t"+prod[i].manuDate+"\nExpirydate:\t"+prod[i].expDate);
		}
	}
	static void displayGrocery(Grocery[] prod, int var) {
		for(int i=0; i<var; i++) {
			System.out.println("ItemId: \t"+prod[i].itemId+"\nProductName:\t"+prod[i].pName+"\nQuantity:\t"+prod[i].quantity+"\nPricePerItem:\t"+prod[i].pricePerItem+"\nCompanyName:\t"+prod[i].companyName+"\nManufacturingDate:\t"+prod[i].manuDate+"\nExpirydate:\t"+prod[i].expDate);
		}
	}
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of product:");
		int N = input.nextInt();
		int a = 0, b = 0, c = 0, d = 0;
		
		System.out.println("Enter number of Bakery product:");
		int bP = input.nextInt();
		Bakery[] bak = new Bakery[bP];
		
		System.out.println("Enter number of Personal care product:");
		int pP = input.nextInt();
		Personal per[] = new Personal[pP];
		
		System.out.println("Enter number of Electrical product:");
		int eP = input.nextInt();
		Electrical elec[] = new Electrical[eP];
		
		System.out.println("Enter number of Grocery product:");
		int gP = input.nextInt();
		Grocery groc[] = new Grocery[gP];
		
		for(int i=0; i<N; i++) { 
			System.out.println("1.Bakery\t\t2.Personal-Care\t\t3.Electrical-products\t\t4.Grocery");
			int n = input.nextInt();
			
			System.out.println("Enter the item id:");
			String itemId = input.next();
			
			System.out.println("Enter the product name:");
			String pName = input.next();
			
			System.out.println("Enter the quantity of item:");
			int quantity = input.nextInt();
			
			System.out.println("Enter the price per item:");
			double pricePerItem = input.nextDouble();
			
			System.out.println("Enter manufacturing date:");
			String manuDate = input.next();
			
			System.out.println("Enter expiry date:");
			String expDate = input.next();
			
			System.out.println("Enter company name:");
			String companyName = input.next();

			
			if(n == 1) {
				bak[a] = new Bakery();
				bak[a].setItemId(itemId);
				bak[a].setPName(pName);
				bak[a].setQuantity(quantity);
				bak[a].setPricePerItem(pricePerItem);
				bak[a].manuDate = manuDate;
				bak[a].expDate = expDate;
				bak[a].companyName = companyName;
				a += 1;
			}
			else if(n == 2) {
				per[b] = new Personal();
				per[b].setItemId(itemId);
				per[b].setPName(pName);
				per[b].setQuantity(quantity);
				per[b].setPricePerItem(pricePerItem);
				per[b].manuDate = manuDate;
				per[b].expDate = expDate;
				per[b].companyName = companyName;
				b += 1;
			}
			else if(n == 3) {
				elec[c] = new Electrical();
				elec[c].setItemId(itemId);
				elec[c].setPName(pName);
				elec[c].setQuantity(quantity);
				elec[c].setPricePerItem(pricePerItem);
				elec[c].manuDate = manuDate;
				elec[c].expDate = expDate;
				elec[c].companyName = companyName;
				c += 1;
			}
			else if(n == 4) {
				groc[d] = new Grocery();
				groc[d].setItemId(itemId);
				groc[d].setPName(pName);
				groc[d].setQuantity(quantity);
				groc[d].setPricePerItem(pricePerItem);
				groc[d].manuDate = manuDate;
				groc[d].expDate = expDate;
				groc[d].companyName = companyName;
				d += 1;
			}
		}
		displayBakery(bak, a);
		displayPersonal(per, b);
		displayElectrical(elec, c); 
		displayGrocery(groc, d); 
	}
}

class Product {
	String itemId, pName;
	int quantity;
	double pricePerItem;
	
	Product(){
		this.itemId       = null;
		this.pName        = null;
		this.quantity      = 0;
		this.pricePerItem = 0.0;
	}
	
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId() {
		return itemId;
	}
	
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPName() {
		return pName;
	}
	
	
	public void setQuantity(int quantity) {
		if(quantity < 0) 
			this.quantity = 0;
		else
			this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem < 0.0) 
			this.pricePerItem = 0.0;
		else
			this.pricePerItem = pricePerItem;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public double getProductAmount() {
		return this.quantity * this.pricePerItem;
	}	
}


class Bakery extends Product {	
	String manuDate, expDate, companyName;
}

class Personal extends Product {	
	String manuDate, expDate, companyName;
}	
	
	
class Electrical extends Product {	
	String manuDate, expDate, companyName;
}	
	
class Grocery extends Product {	
	String manuDate, expDate, companyName;
}
