package org.home.chapter04.partA.airplane;

/**
 * This is Airplane. It has model,
 * some number of Engine,
 * some number of Wing,
 * some number of Chassis,
 * start an finish points of Route.
 */
public class Airplane {
    
    private String model;
    
    private Engine engine;
    
    private int engineNumber;
    
    private Wing wing;
    
    private int wingNumber;
    
    private Chassis chassis;
    
    private int chassisNumber;
    
    private String startPoint;
    
    private String finishPoint;
    
    public Airplane() {}
    
    public Airplane(String model) {
        this.model = model;
    }
    
    public Airplane(String model, Engine engine, int engineNumber) {
        this(model);
        this.engine = engine;
        if (checkPositive(engineNumber)) this.engineNumber = engineNumber;
    }
    
    public Airplane(String model, Engine engine, int engineNumber,
                    Wing wing, int wingNumber) {
        this(model, engine, engineNumber);
        this.wing = wing;
        if (checkPositive(wingNumber)) this.wingNumber = wingNumber;
    }
    
    public Airplane(String model, Engine engine, int engineNumber,
                    Wing wing, int wingNumber, Chassis chassis, int chassisNumber) {
        this(model, engine, engineNumber, wing, wingNumber);
        this.chassis = chassis;
        if (checkPositive(chassisNumber)) this.chassisNumber = chassisNumber;
    }
    
    private boolean checkPositive(int value) {
        return value > 0;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public int getEngineNumber() {
        return engineNumber;
    }
    
    public void setEngineNumber(int engineNumber) {
        if (checkPositive(engineNumber)) this.engineNumber = engineNumber;
    }
    
    public Wing getWing() {
        return wing;
    }
    
    public void setWing(Wing wing) {
        this.wing = wing;
    }
    
    public int getWingNumber() {
        return wingNumber;
    }
    
    public void setWingNumber(int wingNumber) {
        if (checkPositive(wingNumber)) this.wingNumber = wingNumber;
    }
    
    public Chassis getChassis() {
        return chassis;
    }
    
    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }
    
    public int getChassisNumber() {
        return chassisNumber;
    }
    
    public void setChassisNumber(int chassisNumber) {
        if (checkPositive(chassisNumber)) this.chassisNumber = chassisNumber;
    }
    
    public String getStartPoint() {
        return startPoint;
    }
    
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }
    
    public String getFinishPoint() {
        return finishPoint;
    }
    
    public void setFinishPoint(String finishPoint) {
        this.finishPoint = finishPoint;
    }
    
    public void setRoute(String startPoint, String finishPoint) {
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
    }
    
    public void printRoute() {
        System.out.println("Route: " + startPoint + " -> " + finishPoint + ".");
    }
    
    public void fly() {
        System.out.println("Airplane is flying!");
        printRoute();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airplane: ").append(model).append("\n");
        sb.append(" - ").append(engine).append(" Number: ").append(engineNumber).append(".").append("\n");
        sb.append(" - ").append(wing).append(" Number: ").append(wingNumber).append(".").append("\n");
        sb.append(" - ").append(chassis).append(" Number: ").append(chassisNumber).append(".").append("\n");
        sb.append("Route: ").append(startPoint).append(" -> ").append(finishPoint).append(".");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += model.hashCode() + engine.hashCode() + 3 * engineNumber;
        output += wing.hashCode() + 5 * wingNumber;
        output += chassis.hashCode() + 7 * chassisNumber;
        output += startPoint.hashCode() + finishPoint.hashCode();
        return output;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Airplane a = (Airplane) object;
        //model
        if (model == null) {
            if (a.getModel() != null) {
                return false;
            }
        } else {
            if (!model.equals(a.getModel())) {
                return false;
            }
        }
        //engine
        if (engine == null) {
            if (a.getEngine() != null) {
                return false;
            }
        } else {
            if (!engine.equals(a.getEngine())) {
                return false;
            }
        }
        if (engineNumber != a.getEngineNumber()) {
            return false;
        }
        //wing
        if (wing == null) {
            if (a.getWing() != null) {
                return false;
            }
        } else {
            if (!wing.equals(a.getWing())) {
                return false;
            }
        }
        if (wingNumber != a.getWingNumber()) {
            return false;
        }
        //chassis
        if (chassis == null) {
            if (a.getChassis() != null) {
                return false;
            }
        } else {
            if (!chassis.equals(a.getChassis())) {
                return false;
            }
        }
        if (chassisNumber != a.getChassisNumber()) {
            return false;
        }
        //startPoint
        if (startPoint == null) {
            if (a.getStartPoint() != null) {
                return false;
            }
        } else {
            if (!startPoint.equals(a.getStartPoint())) {
                return false;
            }
        }
        //finishPoint
        if (finishPoint == null) {
            if (a.getFinishPoint() != null) {
                return false;
            }
        } else {
            if (!finishPoint.equals(a.getFinishPoint())) {
                return false;
            }
        }
        return true;
    }
}
