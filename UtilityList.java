package ETAUIM;

import java.util.ArrayList;
import java.util.List;


class UtilityList {
	int[] itemset;  // the item
	int sumIutils = 0;  // the sum  of item utilities
	double sumMau = 0.0;
	double sumRmu =0.0;
	int prefixIndex = 0; //the index of the prefix of an itemset
	//LA pruning strategy
	List<Element> elements = new ArrayList<Element>();  // the elements
	
	/**
	 * Constructor.
	 * @param item the item that is used for this utility list
	 */
	public UtilityList(int[] itemset){
		this.itemset = itemset;
	}
	
	/**
	 * Method to add an element to this utility list and update the sums at the same time.
	 */
	public void addElement(Element element){
		sumIutils += element.iutils;
		elements.add(element);
		sumRmu += element.rmu;
	}	
}
