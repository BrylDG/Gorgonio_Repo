import java.util.*;

public class dataStruct {
	
	public static void main (String[] args) {
		double[] list = {1,2,3,4,5};
		double[] newList = new double[list.length-1];
		boolean found = false;
		int opt = 0;
		double num;
		Scanner sc = new Scanner(System.in);
		while (opt != 7) {
		System.out.println(Arrays.toString(list) + "\n\nChoose an option: " + 
						"\n\n 1. Insert an element at the beginnning." +
						"\n 2. Insert an element at the end." + 
						"\n 3. Delete an element from the array." + 
						"\n 4. Search for an element and check its index." + 
						"\n 5. Update an element." + 
						"\n 6. Print Array List." +
						"\n 7. Exit Program");
	opt = sc.nextInt();
	
	switch(opt) {
	case 1: 	
		System.out.println("Enter a new number: ");
		list[0] = sc.nextDouble();
		break;
	case 2:
		System.out.println("Enter a new number: ");
		list[4] = sc.nextDouble();
		break;
	case 3: 
		System.out.println("Delete element number: ");
		num = sc.nextDouble();
		for (int i = 0; i < list.length; i++) {
			if (list[i] == num) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Number not found!");
		} else {
		for(int a = 0, b = 0; a < list.length; a++){
            if(list[a] != num){
                newList[b] = list[a];
                b++;
            	}
			}
    		list = newList; 
		}
		found = false;
    	break;
	case 4:
		System.out.println("Select a number from the list: ");
		num = sc.nextDouble();
		for (int i = 0; i < list.length; i++) {
			if (list[i] == num) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Number not found!");
		} else {
			for (int a = 0; a < list.length; a++) {
				if (list[a] == num) {
					System.out.println("Index: " + a);
				}
			}
		}
		found = false;
    	break;
	case 5:
		System.out.println("Select a number from the list: ");
		num = sc.nextDouble();
		for (int i = 0; i < list.length; i++) {
			if (list[i] == num) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Number not found!");
		} else {
			System.out.println("Enter new number: ");
			int num2 = sc.nextInt();	
			for(int a = 0, b = 0; b < 1; a++){
	            if(list[a] == num){
	                list[a] = num2;
	                b++;
	            }
			}
		}
		break;
	case 6:
		System.out.println(Arrays.toString(list));
		break;
	case 7:
		System.out.println("Exiting Program");
		break;
	default: System.out.println("Invalid Option! \n\n");
   }
  }
 }
}