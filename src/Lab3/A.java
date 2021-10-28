package Lab3;

import java.util.ArrayList;
import java.util.HashMap;

class Mobile {
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model) {
		return addMobile(model, model);
	}

	public HashMap<String, ArrayList<String>> getModels() {
		return mobiles;
	}

	public void buyMobiles(HashMap<String, ArrayList<String>> mobiles) {
		this.mobiles = mobiles;
	}

	String addMobile1(String company, String model) {
		return "model successfully added";
	}

	ArrayList<String> getModel(String company) {
		return null;
	}

	String buyMobile(String company, String model) {
		return "item not available";
	}
}

class A {
	public static void main(String args[]) throws Exception {
		Mobile obj = new Mobile();
		obj.addMobile("Oppo", "K3");
		obj.getModels();
		obj.buyMobile("Oppo", "K3");/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}