public class Car {
    //instance variables
    String carMaker = null;
    String carColor = null;
    //constructor (default)
    public Car() {
        
    }

    //constructor (full)
    public Car(String carColor, String carMaker) {
        this.carMaker = carMaker;
        this.carColor = carColor;
        }
    //getters
    public String getCarMaker() {
        return carMaker;
    }
    public String getCarColor() {
        return carColor;
    }
     //setters
     public void setCarMaker(String carMaker) {
         this.carMaker = carMaker;
     }

     public void setCarColor(String carColor) {
         this.carColor = carColor;
    }
    //toString
    public String toString(){
        return "Car [" + this.carColor + ", " + this.carMaker + "]";
    }
    //equals method
    protected boolean equals(Car other) {
        return this.carColor.equals(other.carColor) && this.carMaker.equals(other.carMaker);
    }
}
