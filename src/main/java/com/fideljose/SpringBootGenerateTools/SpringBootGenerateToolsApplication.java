package com.fideljose.SpringBootGenerateTools;

import com.fideljose.SpringBootGenerateTools.aop.BeforeExample;
//import com.fideljose.SpringBootGenerateTools.aop.BeforeExample2;
import com.fideljose.SpringBootGenerateTools.lifeCycle.LoadEager;
import com.fideljose.SpringBootGenerateTools.lifeCycle.LoadLazy;
import com.fideljose.SpringBootGenerateTools.models.Address;
import com.fideljose.SpringBootGenerateTools.models.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootGenerateToolsApplication {

	final static Logger logger = LoggerFactory.getLogger(Profile.class);

	//private static BeforeExample beforeExample;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootGenerateToolsApplication.class, args);
		LoadLazy loadLazy = context.getBean(LoadLazy.class);
		LoadEager loadEager = context.getBean(LoadEager.class);
		BeforeExample t = context.getBean(BeforeExample.class);
		t.hello("Hello");
		Address address = context.getBean(Address.class);
		address.getDescription();
	}

}