package com.tmpslab2;

import com.tmpslab2.composite.Camera;
import com.tmpslab2.composite.DigitalCamera;
import com.tmpslab2.composite.DSLRCamera;
import com.tmpslab2.composite.MirrorlessCamera;
import com.tmpslab2.bridge.*;
import com.tmpslab2.proxy.*;

public class Main {

    public static void main(String[] args) {
	System.out.println("Camera characteristics: " + "\n");
	Camera dslrCamera = new DSLRCamera("Nikon", "D750", "Professional", "999 USD");
	Camera dslrCamera2 = new DSLRCamera("Canon", "EOS 80d", "Professional", "949 USD");
	Camera digitalCamera = new DigitalCamera("Kodak", "PIXPRO FZ53", "Amateur", "90 USD");
	Camera digitalCamera2 = new DigitalCamera("Olympus", "Tough TG-6", "Amateur", "429 USD");
	Camera mirrorlessCamera = new MirrorlessCamera("Sony", "ALPHA A6000", "Professional", "599 USD");

	dslrCamera.add(dslrCamera2);
	System.out.println(dslrCamera.toString());
	dslrCamera2.add(digitalCamera);
	System.out.println(dslrCamera2.toString());
	System.out.println(digitalCamera.toString());
	digitalCamera.add(digitalCamera2);
	System.out.println(digitalCamera2.toString());
	System.out.println(mirrorlessCamera.toString());

	System.out.println("\n");
	com.tmpslab2.bridge.Camera MirrorlessCamera = new com.tmpslab2.bridge.MirrorlessCamera(new CMOS());
	MirrorlessCamera.characteristics();
	com.tmpslab2.bridge.Camera DigitalCamera = new com.tmpslab2.bridge.DigitalCamera(new CCD());
	DigitalCamera.characteristics();

	System.out.println("\n");
	IDSLRCamera fileFormat = new DSLRCameraProxy();
	fileFormat.description();
    }
}
