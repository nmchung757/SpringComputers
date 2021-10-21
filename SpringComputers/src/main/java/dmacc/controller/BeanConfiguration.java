package dmacc.controller;

import org.springframework.context.annotation.Bean;

import dmacc.beans.Computer;

/**
 * @author Noah Chung - nmchung
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
public class BeanConfiguration {
	@Bean
	public Computer computer() {
		Computer bean = new Computer("Vengence");
		return bean;
	}
}
