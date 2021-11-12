package hnr.belajarSpring.core.daat;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {


    @PostConstruct
    public  void  start(){
        log.info("start server !");
    }

    @PreDestroy
    public  void  stop(){
        log.info("stop server  !!");
    }

}
