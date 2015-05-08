/**
 * iPOJO sample service consumer.
 * REMOVE THIS CLASS AS SOON AS YOU UNDERSTOOD WHAT THIS FILE GOING TO DO.
 */
package ${package}.internal;

import ${package}.SampleIntf;
import org.osgi.service.log.*;

public class SampleConsumerImpl {
	//@Requires
	private LogService logService;
	
	private SampleIntf svc;
	void setService(SampleIntf service) {
		System.out.println("Got service");
		svc = service;
	}
	void clearService() {
		svc = null;
	}
	void start() {
		// do something
		if(logService==null)
			System.out.println("started");
		else 
			logService.log(LogService.LOG_DEBUG, "started");
	}
	void stop() {
		// do something
		System.out.println("stopped");
	}
}
