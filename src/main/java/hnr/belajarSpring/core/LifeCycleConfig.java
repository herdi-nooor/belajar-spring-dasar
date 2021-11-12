package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Connection;
import hnr.belajarSpring.core.daat.Server;
import org.springframework.context.annotation.Bean;

public class LifeCycleConfig {

    @Bean
    public Connection connection(){
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop") // ini dibutuhkan jika tidak menggunakan @postconstruc dan @predestroy
    @Bean
    public Server server(){
        return new Server();
    }

}
