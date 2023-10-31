package Inheritan_Overriding;

import java.util.*;

public class Ice_Cream_13_8 {
    public static void main(String[] args) {
        List<String> chocolateMilk = Arrays.asList("chocolate", "milk");
        IceCreamFlavor ic = new IceCreamFlavor("Chocolate chip", "chocolate", chocolateMilk);
        IceCreamFlavor ic2 = new IceCreamFlavor("Chocolate chip", "chocolate", chocolateMilk);
        System.out.println(ic.equals(ic2));
    }
}

class IceCreamFlavor {
    private static int lastId = 999;
    private int id;
    private String name;
    private String base;
    private List<String> ingredients;

    public IceCreamFlavor(String name, String base, List<String> ingredients) {
        this.id = ++lastId;
        this.name = name;
        this.base = base;
        this.ingredients = new ArrayList<>(ingredients);
        Collections.sort(this.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), base.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IceCreamFlavor other = (IceCreamFlavor) obj;
        return name.equalsIgnoreCase(other.name) && base.equalsIgnoreCase(other.base)
                && ingredients.equals(other.ingredients);
    }
}
