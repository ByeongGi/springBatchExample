package com.kira.batch.core;

import org.apache.log4j.Logger;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application extends AbstaractApplication{

	private static Logger logger = Logger.getLogger(Application.class);
	
	
	private ApplicationContext springBeanContainer;
	
	public ApplicationContext getSpringBeanContainer() {
		return springBeanContainer;
	}
	
	public Application() { 
		boot();
	}

	@Override
	public void boot() {
		ApplicationContext applicationContext =  new GenericXmlApplicationContext( 
				 new ClassPathResource("/launch-context.xml"));
		this.springBeanContainer = applicationContext;		
		
		logger.info(  "\n"  
				+ "\n #################################### SYSTEM MESSAGE ######################################################"
				+ "\n"
			    + "\n               			Start.... KIRA Batch SYSTEM !!!! "    
			    + "\n"
			    + "\n ########################################################################################################## \n\n");
		beanLoadingView();
	}

	@Override
	public ApplicationContext run() {
		
		JobLauncher jobLauncher = (JobLauncher) springBeanContainer.getBean("jobLauncher");
		// jobLauncher.run(, new JobParameters());
		
		return null;
	}
	
	
	
	
	private void beanLoadingView(){
		String[] beanNames = this.springBeanContainer.getBeanDefinitionNames();
		StringBuffer sb = new StringBuffer();
			sb.append(  "\n"  
				      + "\n ##################################### BEAN LODING LIST...###############################################");
		for (String beanName : beanNames) {
			
			sb.append( 
						  "\n"
					    + "\n     BeanName [ "+ beanName +"] "
					    + "\n"
				     );
		}
		
			sb.append(  "\n ########################################################################################################"  
			          + "\n");
		logger.info(sb.toString());
	}
	

}
