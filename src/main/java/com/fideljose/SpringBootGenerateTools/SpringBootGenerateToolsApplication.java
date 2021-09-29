package com.fideljose.SpringBootGenerateTools;

import com.fideljose.SpringBootGenerateTools.lifeCycle.LoadEager;
import com.fideljose.SpringBootGenerateTools.lifeCycle.LoadLazy;
import com.fideljose.SpringBootGenerateTools.models.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootGenerateToolsApplication {

	final static Logger logger = LoggerFactory.getLogger(Profile.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootGenerateToolsApplication.class, args);
		Profile p = context.getBean(Profile.class);
		logger.info("profile -> {}",  p.toString());
//		LoadLazy loadLazy = context.getBean(LoadLazy.class);
//		LoadEager loadEager = context.getBean(LoadEager.class);
	}

}
