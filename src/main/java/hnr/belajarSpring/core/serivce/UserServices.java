package hnr.belajarSpring.core.serivce;

import hnr.belajarSpring.core.Event.LoginSuccessEvent;
import hnr.belajarSpring.core.daat.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UserServices implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Boolean login(String username, String password){
        if (isLoginSuccess(username, password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }else {
            return false;
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "hn".equals(username) && "hhnn".equals(password);
    }
}
