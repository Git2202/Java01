class Vehicle {
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}


interface Electric {
    void charge();
}


interface Autonomous {
    void driveAutonomously();
}


class Car extends Vehicle implements Electric, Autonomous {
    

    public void charge() {
        System.out.println("Charging the electric car.");
    }


    public void driveAutonomously() {
        System.out.println("Driving autonomously.");
    }
}

public class IS23 {
    public static void main(String[] args) {
     
        Car myCar = new Car();
        myCar.displayInfo();          
        myCar.charge();                
        myCar.driveAutonomously();
    }
}
