package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Map<String, Integer> studioGroup = new HashMap<>();
		
		studioGroup.put("Tom", 170);
		studioGroup.put("Wyatt", 177);

	    while (true) {
	    	System.out.print("Enter a name: ");
	        String name = in.nextLine();
	        if (name.equals("quit")) {
	        	break;
	        }
	        Integer height = studioGroup.get(name);
	        if (height != null) {
	        	System.out.println(name + " is " + height + " cm tall.");
	        } 
	        else {
	        	System.out.println("Height not known of " + name + ".");
	        }
	   }
	}
}
