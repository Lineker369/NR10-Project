package camera.jee;


import org.opencv.core.Core;
import org.opencv.core.Mat;
//import org.opencv.highgui.HighGui;
import org.opencv.videoio.VideoCapture;       
        
public class photografy {
    public static void main (String args[]){
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    	VideoCapture camera = new VideoCapture(0);
    	
    	if(!camera.isOpened()){
    		System.out.println("Error");
    	}
    	else {
    		Mat frame = new Mat();
    	    while(true){
    	    	if (camera.read(frame)){
    	    		System.out.println("Frame Obtained");
    	    		System.out.println("Captured Frame Width " + 
    	    		frame.width() + " Height " + frame.height());
    	    	//	HighGui.imwrite("camera.jpg", frame);
    	    		System.out.println("OK");
    	    		break;
    	    	}
    	    }	
    	}
    	camera.release();
    }
}