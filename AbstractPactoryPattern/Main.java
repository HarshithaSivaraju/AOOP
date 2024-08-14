package com.AbstractPactoryPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bike dieselbike = new DieselBike();
  dieselbike.ride();
  Bike electricbike = new ElectricBike();
  electricbike.ride();
  Bike gasolinebike = new GasolineBike();
  gasolinebike.ride();
  
  Car dieselcar = new DieselCar();
  dieselcar.drive();
  Car electriccar = new ElectricCar();
  electriccar.drive();
  Car gasolinecar = new GasolineCar();
  gasolinecar.drive();
  
  
 Truck dieseltruck = new DieselTruck();  
 dieseltruck.haul();
 Truck electrictruck = new ElectricTruck();
 electrictruck.haul();
 Truck gasolinetruck = new GasolineTruck();
 gasolinetruck.haul();
 
	}
}
