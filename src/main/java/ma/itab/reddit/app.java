package ma.itab.reddit;

public class app {
    public static void main(String[] arg){
        Car car = new Car();
        try {
            System.out.println(car.start());
            System.out.println(car.start());
            System.out.println(car.start());
        }catch (Exception ex){
            System.out.println("sending email" + ex.getMessage());
        }
        }


    class Car {
        private Engine engine = new Engine();

        public boolean start() throws NotEnoughtFuelIException {
            return engine.startEngine();
        }
    }

    class Engine {
        private Tank tank = new Tank();

        public boolean startEngine() throws  NotEnoughtFuelIException {
            return tank.getFuel(100);
        }
    }

    class Tank {
        public int capacity = 150;

        public boolean getFuel(int quantity) throws NotEnoughtFuelIException{
            if (capacity >= quantity) {
                capacity -= quantity;
                return true;
            } else
                throw new NotEnoughtFuelIException("not enough fuel,capacity=" + capacity+"requerd"+quantity);
        }
    }

    class NotEnoughtFuelIException extends Exception{
        public NotEnoughtFuelIException(String msg){
            super(msg);
        }
    }
}


