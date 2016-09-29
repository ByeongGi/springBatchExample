package com.kira.batch.core;

import org.springframework.context.ApplicationContext;

public abstract class AbstaractApplication {
	
	public abstract void boot();
	public abstract ApplicationContext run();
}
