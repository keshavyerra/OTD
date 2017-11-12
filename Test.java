import java.util.List;
import java.io.*;
import com.sherwin.profile.ProfileBuilder;
import com.sherwin.build.bean.Build;
import com.sherwin.otd.commands.ConfigurationCommands;
//import org.python.util.InteractiveInterpreter;
//import weblogic.management.scripting.utils.WLSTInterpreter;


public class Test {

	public static void main(String[] args) {
		String buildprop_array[] = new String[4];
		ProfileBuilder test = new ProfileBuilder();
	    Build one = test.getBuildProperties();
		buildprop_array[0] = one.getActions().toString();
		buildprop_array[1] = one.getApplications().toString();
        buildprop_array[2] = one.getClass().toString();
        buildprop_array[3] = one.getTags().toString();	
        System.out.println(one.getActions());
	    System.out.println(one.getApplications());
	    System.out.println(one.getClass());
	    System.out.println(one.getTags());
		PrintStream out = new PrintStream(new FileOutputStream("/var/jenkins_home/workspace/java/output.txt"));
                System.setOut(out);
		//ConfigurationCommands configurationCommands = new ConfigurationCommands();
/*
		System.out.println("********************************");
	    InteractiveInterpreter interpreter = new WLSTInterpreter();    
	    
		//List<String> list = configurationCommands.getCreateConfigCommands();
		
		interpreter.exec("connect('weblogic', 'welcome1','t3://e5afafb2da74:7001')");
		for (String command : buildprop_array) {
			System.out.println(command);
    		interpreter.exec(command);

		}	*/	
	}

}
