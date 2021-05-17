public class ChangeAmount {
	
	public static boolean change(double cost, double paid) {
		if(cost == paid) {
			System.out.println("No Change Given");
			return false;
		}
		double changeDue = paid - cost;
		System.out.println(changeDue);
		while(changeDue > 0) {
			if(changeDue >= 100) {
				int temp = (int)changeDue / 100;
				System.out.println(temp + ": hundred dollar bills");
				changeDue -= temp*100;
			}
			else if(changeDue >= 20) {
				int temp = (int)changeDue / 20;
				System.out.println(temp + ": twenty dollar bills");
				changeDue -= temp*20;
			}
			else if(changeDue >= 10) {
				int temp = (int)changeDue / 10;
				System.out.println(temp + ": ten dollar bills");
				changeDue -= temp*10;
			}
			else if(changeDue >= 5) {
				int temp = (int)changeDue / 5;
				System.out.println(temp + ": five dollar bills");
				changeDue -= temp*5;
			}
			else if(changeDue >= 1) {
				int temp = (int)changeDue / 1;
				System.out.println(temp + ": one dollar bills");
				changeDue -= temp*1;
			}
			else if(changeDue >= .25) {
				changeDue = Math.round(changeDue * 100.0) / 100.0;
				int temp = (int)(Math.round(changeDue * 100)) / 25;
				System.out.println(temp + ": quarters");
				changeDue -= temp*.25;
			}
			else if(changeDue >= .1) {
				changeDue = Math.round(changeDue * 100.0) / 100.0;
				int temp = (int)(changeDue * 100) / 10;
				System.out.println(temp + ": dimes");
				changeDue -= temp*.1;
			}
			else if(changeDue >= .05) {
				changeDue = Math.round(changeDue * 100.0) / 100.0;
				int temp = (int)(changeDue * 100) / 5;
				System.out.println(temp + ": nickles");
				changeDue -= temp*.05;
			}else if(changeDue >= .01) {
				changeDue = Math.round(changeDue * 100.0) / 100.0;
				int temp = (int)(changeDue * 100) / 1;
				System.out.println(temp + ": pennies");
				changeDue -= temp*.01;
			}else {
				break;
			}
		}
		return true;
	}
}
