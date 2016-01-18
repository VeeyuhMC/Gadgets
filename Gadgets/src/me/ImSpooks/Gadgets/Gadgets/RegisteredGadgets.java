package me.ImSpooks.Gadgets.Gadgets;

import java.util.ArrayList;
import java.util.List;

public class RegisteredGadgets {
	
	List<Gadget> gadgets = new ArrayList<Gadget>();
	
	public void initializeGadgets(){
		gadgets.add(null);
	}
	
	public static List<Gadget> registeredGadgets(){
		return new RegisteredGadgets().gadgets;
	}
}