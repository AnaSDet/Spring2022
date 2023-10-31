package Inheritan_Overriding;

public class Cook_13_3 {
    public static void main(String[] args) {

    }
}
class Cook{
    protected String name;
    protected int time;

    public void cookFood() { //values are assigned, the message is printed in parent
    }
}

class Chef extends Cook{
    Chef(){ //default constructor.
        this.name = "Pasta";
        this.time = 90;

    }
    @Override
    public void cookFood(){

    }
}
class Baker extends Cook{
    public Baker() { //public constructor.  child constructors are used in test, for that reason they are public.
        this.name = "Cake";
        this.time = 180;
    }
    @Override
    public void cookFood(){ //cookFood(): Overrides the parent class method to represent the specific
        //cooking behavior of a chef. Assign name of the dish "Pasta" and time to 90 mins.


    }
}