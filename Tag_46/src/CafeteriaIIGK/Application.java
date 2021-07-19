package CafeteriaIIGK;

import java.io.File;
import java.lang.management.ManagementFactory;

import CafeteriaIIGK.control.ControllerCafeteria;

public class Application {
	
	public static StringBuilder cmd;

	public static void main(String[] args) {
		
		/**
		 * creates a string for restart
		 */
		cmd = new StringBuilder();
        cmd.append(System.getProperty("java.home") + File.separator + "bin" + File.separator + "java ");
        /*
        for (String jvmArg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
            cmd.append(jvmArg + " ");
        }*/
        cmd.append("-cp \"").append(ManagementFactory.getRuntimeMXBean().getClassPath()).append("\" ");
        cmd.append(Application.class.getName()).append(" ");
        for (String arg : args) {
            cmd.append(arg).append(" ");
        }
        
        System.out.println(cmd.toString());
        
		@SuppressWarnings("unused")
		ControllerCafeteria c = new ControllerCafeteria();

	}

}
