public class Quiz2Client {
    public static void main(String[] args) {
        //classes
        Car car = new Car();
        Truck truck = new Truck();
        Drone drone = new Drone(1,100,720,50);


        Test_Car(car);
        Test_Truck(truck,car);
        Test_Drone(drone);
        
    }

    ///TEST
    static void Test_Electricity(Electricity obj){ 
        System.out.println("--Testing Electricity--");
        obj.charge(1);
        obj.checkBattery();
    }

    static void Test_Fuel(Fuel obj){
        
        System.out.println("--Testing Fuel--");
        obj.checkFuel();
        obj.reFuel(1, 1);
        
    }

    static void Test_Vehicle(Vehicle obj){

        System.out.println("-Testing Vehicle-");
        obj.start();
        obj.shutdown();
        obj.runs();
        obj.nearestStation(1);


        Test_Fuel(obj);
        Test_Electricity(obj);
    }
    static void Test_Car(Car obj){

        System.out.println("Testing Car: " + obj.toString());
        

        obj.openDoors();
        obj.openTrunk();
        obj.lock();



        Test_Vehicle(obj);

        System.out.println();
    }

    static void Test_Truck(Truck obj,Object towed){

        System.out.println("Testing Truck: " + obj.toString());
        obj.openDoors();
        obj.lock();

        obj.tow(towed);

        Test_Vehicle(obj);

        System.out.println();
    }
    ///aircraft

    static void Test_Aircraft(Aircraft obj){
        System.out.println("-Testing Aircraft-");
        obj.start();
        obj.fly();
        obj.land(1);
        obj.returnBase();


        Test_Electricity(obj);
    }

    static void Test_Drone(Drone obj){
        System.out.println("Testing Drone: " + obj.toString());
        obj.record();
        obj.capture();
        obj.flip(1);

        Test_Aircraft(obj);

        System.out.println();
    }



}
