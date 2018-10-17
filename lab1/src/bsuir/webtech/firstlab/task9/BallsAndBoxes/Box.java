package bsuir.webtech.firstlab.task9.BallsAndBoxes;

public class Box {

    double totalWeight;
    public double getTotalWeight(){
        return totalWeight;
    }
    public void addTotalWeight(double extra){
        this.totalWeight += extra;
    }

    int blueAmount;
    public int getBlueAmount(){
        return blueAmount;
    }
    public void incBlueAmount(){
        this.blueAmount++;
    }


}
