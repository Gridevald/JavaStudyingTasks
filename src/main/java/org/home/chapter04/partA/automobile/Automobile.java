package org.home.chapter04.partA.automobile;

public class Automobile {
    
    private String carModel;
    
    private Engine engine;
    
    private Wheel wheels;
    
    private int wheelsNumber;
    
    public Automobile(String carModel) {
        this.carModel = carModel;
    }
    
    public Automobile(String carModel, Engine engine) {
        this.carModel = carModel;
        this.engine = engine;
    }
    
    public Automobile(String carModel, Engine engine, Wheel wheels, int wheelsNumber) {
        this.carModel = carModel;
        this.engine = engine;
        this.wheels = wheels;
        this.wheelsNumber = wheelsNumber;
    }
    
    public String getCarModel() {
        return carModel;
    }
    
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public Wheel getWheels() {
        return wheels;
    }
    
    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }
    
    public int getWheelsNumber() {
        return wheelsNumber;
    }
    
    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }
    
    public void drive() {
        //some code to drive
        //we need something connected with speed
        //and time of moving
        //and reducing fuel volume
        System.out.println("Car is moving...");
    }
    
    public void stop() {
        //make speed = 0
        System.out.println("Car stopped.");
    }
    
    public void addFuel() {
        //something about fuel volume
        System.out.println("Fuel is added.");
    }
    
    public void showCarModel() {
        System.out.println("Car model is: " + carModel);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Automobile: ");
        sb.append(carModel).append("\n");
        if (engine != null) {
            sb.append(engine).append("\n");
        }
        if (wheels != null) {
            sb.append(wheels).append(" Number: ").append(wheelsNumber).append(".").append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = carModel.hashCode();
        if (engine != null) {
            output += engine.hashCode();
        }
        if (wheels != null) {
            output += wheels.hashCode();
        }
        if (wheelsNumber != 0) {
            output += 3 * wheelsNumber;
        }
        return output;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Automobile a = (Automobile) obj;
        if (!carModel.equals(a.carModel)) {
            return false;
        }
        if (engine == null) {
            if (a.engine != null) {
                return false;
            }
        } else {
            if (!engine.equals(a.engine)) {
                return false;
            }
        }
        if (wheels == null) {
            if (a.wheels != null) {
                return false;
            }
        } else {
            if (!wheels.equals(a.wheels)) {
                return false;
            }
        }
        if (wheelsNumber != a.wheelsNumber) {
            return false;
        }
        return true;
    }
}
