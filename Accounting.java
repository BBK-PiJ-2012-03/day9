public class Accounting {
/**
* The first element of the list of bills
*/
	private Bill firstBill = null;
	public static void main(String[] args) {
		Accounting acc = new Accounting();
		acc.launch(args);
	}
	private void launch(String[] args) {
		String concept = "";
		int amount = 0;
	do {
		System.out.println("What’s your next bill (type \"END\" to finish)?");
		System.out.print(" Concept: ");
		concept = System.console().readLine();
		if (!concept.equals("END")) {
			System.out.print(" Amount: ");
			String strAmount = System.console().readLine();
			amount = Integer.parseInt(strAmount);
		}
		Bill newBill = new Bill(concept, amount);
		addBillToList(newBill);
	} while (!concept.equals("END"));
		int count = 0;
		int totalDebt = 0;
		for (Bill current = firstBill; current != null; current = current.getNextBill()) {
			count++;
			totalDebt += current.getAmount();
		}
		System.out.println("You have " + count + " bills unpaid (total debt: " + totalDebt + ")");
	}	
	
	
	
	
	
	private void addBillToList(Bill bill) {
		if (firstBill == null) {
			firstBill = bill;
			return;
		}
		Bill current = firstBill;
		while (current != null) {
			if (current.getNextBill() == null) {
				current.setNextBill(bill);
				return;
			}
			current = current.getNextBill();
		}
		return;
	}
}