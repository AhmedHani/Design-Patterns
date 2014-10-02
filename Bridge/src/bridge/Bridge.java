/*
 */
package bridge;

/**
 *
 * @author ahani
 */
public class Bridge {

    public interface VehicleObject {
        public void move();
        public void accelerate();
        public void stop();
        public void repair();
    }
    
    public static class Car implements VehicleObject {
        public void move() {
            System.out.println("Car is moving!");
        }
        
        public void accelerate() {
            System.out.println("Car is accelerating!");
        }
        
        public void stop() {
            System.out.println("Car stopped!");
        }
        
        public void repair() {
            System.out.println("Car is repaired!!");
        }
    }
    
    public static class Bus implements VehicleObject {
        public void move() {
            System.out.println("Bus is moving!");
        }
        
        public void accelerate() {
            System.out.println("Bus is accelerating!");
        }
        
        public void stop() {
            System.out.println("Bus stopped!");
        }
        
        public void repair() {
            System.out.println("Bus is repaired!!");
        }
    }
    
    public interface EngineObject {
        public void running();
        public void stopped();
    }
    
    public static class Engine implements EngineObject {
        private VehicleObject object;
        
        public void setObject(VehicleObject object) {
            this.object = object;
        }
        
        public void running() {
            this.object.move();
        }
        
        public void stopped() {
            this.object.stop();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creating Implementation Objects
        Car newCar = new Car();
        Bus newBus = new Bus();
        //
        
        //Abstraction Object
        Engine newEngine = new Engine();
        //
        
        newEngine.setObject(newCar);
        newEngine.running();
        newEngine.stopped();
        
        System.out.println("");
        
        newEngine.setObject(newBus);
        newEngine.running();
        newEngine.stopped();
    }
    
}


