package org.pranit.java.basics;
public class Shipping {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
    	if ((items - (5 * availableLargePackages + availableSmallPackages)) > 0)
            return -1;
    	
    	if (items < 5)
             return items;       

        int rl = items / 5;

        if (rl > availableLargePackages)
        rl = availableLargePackages;

        return rl + (items - 5 * rl);
    }
    
    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(9, 1, 3));
    }
}