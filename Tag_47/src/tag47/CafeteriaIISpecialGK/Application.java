package tag47.CafeteriaIISpecialGK;

import java.io.File;
import java.lang.management.ManagementFactory;

import tag47.CafeteriaIISpecialGK.control.ControllerCafeteria;

public class Application {
	
	public static StringBuilder cmd;

	public static void main(String[] args) {
		
		/**
		 * creates a string for restart
		 */
		cmd = new StringBuilder();
        cmd.append(System.getProperty("java.home") + File.separator + "bin" + File.separator + "java ");
        for (String jvmArg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
            cmd.append(jvmArg + " ");
        }
        /**
         * added \" and \" to solve problems with restart-function in other environments
         */
        cmd.append("-cp \"").append(ManagementFactory.getRuntimeMXBean().getClassPath()).append("\" ");
        cmd.append(Application.class.getName()).append(" ");
        for (String arg : args) {
            cmd.append(arg).append(" ");
        }
        
		@SuppressWarnings("unused")
		ControllerCafeteria c = new ControllerCafeteria();

	}

}
