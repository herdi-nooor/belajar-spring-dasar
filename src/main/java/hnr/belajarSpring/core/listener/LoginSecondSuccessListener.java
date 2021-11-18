package hnr.belajarSpring.core.listener;

import hnr.belajarSpring.core.Event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginSecondSuccessListener implements ApplicationListener<LoginSuccessEvent> {

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login lagi lagi for user {}", event.getUser());
    }
}
