package com.tmpslab1;

import com.tmpslab1.singleton.CameraManager;
import com.tmpslab1.builder.CameraBuilder;
import com.tmpslab1.factory.CameraFactory;
import com.tmpslab1.factory.Camera;

public class Main {

    public static void main(String[] args) {
    	CameraManager manager = CameraManager.getInstance();
    	System.out.println("Camera type: " + manager.getName());

    	CameraFactory cameraFactory = new CameraFactory();

		Camera cameraFactory1 = cameraFactory.buildCamera("DSLRCamera");
		System.out.println(cameraFactory1);

		CameraBuilder camera = new CameraBuilder()
			.brand("Nikon").color("black").sensorType("CMOS").maximumResolution(24);
		System.out.println(camera);

		CameraManager manager2 = CameraManager.getInstance();
		System.out.println("\n" + "Camera type: " + manager2.getName2());

		Camera cameraFactory2 = CameraFactory.buildCamera2("DigitalCamera");
		System.out.println(cameraFactory2);

		CameraBuilder camera3 = new CameraBuilder()
				.brand("Olympus").color("red").sensorType("CCD").maximumResolution(8);
		System.out.println(camera3);

	}
}