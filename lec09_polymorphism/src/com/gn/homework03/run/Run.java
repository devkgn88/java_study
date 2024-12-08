package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {
	public static void main(String[] args) {
		Car gasolineCar = new Car(new GasolineEngine());
        Car electricCar = new Car(new ElectricEngine());
        
        gasolineCar.startEngine();
        electricCar.startEngine();
	}
}
