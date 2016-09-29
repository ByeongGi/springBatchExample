package com.kira.batch;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//@Configuration
public class ExampleConfiguration {

//	@Value("${batch.jdbc.driver}")
//	private String driverClassName;
//
//	@Value("${batch.jdbc.url}")
//	private String driverUrl;
//
//	@Value("${batch.jdbc.user}")
//	private String driverUsername;
//
//	@Value("${batch.jdbc.password}")
//	private String driverPassword;
//
//	@Autowired
//	@Qualifier("jobRepository")
//	private JobRepository jobRepository;

//	@Bean
//	public DataSource dataSource() {
//		BasicDataSource dataSource = new BasicDataSource();
//		dataSource.setDriverClassName(driverClassName);
//		dataSource.setUrl(driverUrl);
//		dataSource.setUsername(driverUsername);
//		dataSource.setPassword(driverPassword);
//		return dataSource;
//	}
	
	
	/**
	 * 기본적으로 SimpleJobLauncher는 Spring Framework에서 JobLanucher 의 구현체다
	 * JobLauncher는 배치작업을 실행시키는 역할을 한다. 
	 * Job과 Job Parameters를 이용하여 요청된 배치 작업을 수행한 후 JobExecution을 반환한다.
	 * @return
	 */
	
//	@Bean
//	public SimpleJobLauncher jobLauncher() {
//		SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
//		jobLauncher.setJobRepository(jobRepository);
//		return jobLauncher;
//	}

//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}

}
