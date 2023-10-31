package Abstraction;

public class Park_13_12 {
    public static void main(String[] args) {

    }
}
interface PublicSpace{
    void visit();
    void relax();
}
interface GreenSpace{
    void plantTrees();
    void waterPlants();
}
class Park implements PublicSpace, GreenSpace{
    String parkName;
    int area;
    public Park(String parkName, int area){
        this.parkName=parkName;
        this.area=area;
    }
    @Override
    public void  visit(){
        System.out.println("Visiting " +  parkName+ " park");
    }
    @Override
    public void relax(){
        System.out.println("Relaxing in " + parkName + " park");
    }
    @Override
    public void plantTrees(){
        System.out.println("Planting trees in " + parkName + " park");
    }
    @Override
    public void waterPlants(){
        System.out.println("Watering plants in " + parkName + " park");
    }
    public void showParkDetails(){
        System.out.println("Park: " + parkName);
        System.out.println("Area: "+ area + " square meters");
    }
}