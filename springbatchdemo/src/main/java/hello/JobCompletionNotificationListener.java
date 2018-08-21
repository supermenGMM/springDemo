package hello;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import sun.rmi.runtime.Log;

public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
    private static  final org.slf4j.Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus()== BatchStatus.COMPLETED){
            log.info("!!job finished!");
            jdbcTemplate.query("select first_name ,last_name from people",(rs,row)->
        new Person(rs.getString(1),rs.getString(2)))
            .forEach(person -> {
                log.info("found <"+person.toString()+"> in database");
            });
        }
    }


}

