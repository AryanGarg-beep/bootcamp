class Vehicle {
  String name;

  Vehicle(String name) {
    this.name = name;
  }

  void dispatch() {
    System.out.println(name + " ready");
  }
}

class Bus extends Vehicle {
  int capacity;

  Bus(String name, int capacity) {
    super(name);
    this.capacity = capacity;
  }

  @Override
  void dispatch() {
    System.out.println(name + " (Bus) capacity " + capacity);
  }
}

class Taxi extends Vehicle {
  double distance;

  Taxi(String name, double distance) {
    super(name);
    this.distance = distance;
  }

  @Override
  void dispatch() {
    System.out.println(name + " (Taxi) distance " + distance);
  }
}

class Train extends Vehicle {
  int cars;

  Train(String name, int cars) {
    super(name);
    this.cars = cars;
  }

  @Override
  void dispatch() {
    System.out.println(name + " (Train) cars " + cars);
  }
}

class Bike extends Vehicle {
  double distance;

  Bike(String name, double distance) {
    super(name);
    this.distance = distance;
  }

  @Override
  void dispatch() {
    System.out.println(name + " (Bike) distance " + distance);
  }
}

public class FleetManagement {
  public static void main(String[] args) {
    Vehicle[] fleet = {
        new Bus("CityBus", 50),
        new Taxi("YellowCab", 12.5),
        new Train("Metro", 8),
        new Bike("EcoBike", 3)
    };

    for (Vehicle v : fleet) {
      v.dispatch();
    }
  }
}
