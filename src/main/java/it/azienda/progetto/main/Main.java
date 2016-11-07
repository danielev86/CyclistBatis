package it.azienda.progetto.main;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.azienda.progetto.dao.CyclistDAO;
import it.azienda.progetto.filter.CyclistFilter;

public class Main {

	public static void main(String[] args) throws BeansException, IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("it/ibatis/spring/applicationContext.xml");
		CyclistDAO cyclistDAO = (CyclistDAO) ctx.getBean("cyclistDao");
		CyclistFilter filter = new CyclistFilter();
		System.out.println(cyclistDAO.retrieveCyclist(filter));
		

	}

}
