package hnr.belajarSpring.core.listener;

import hnr.belajarSpring.core.Event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

    // dalam kelas ini bisa menggunakan beberapa anotation eventlistener yang bervariasi
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccesEvent(LoginSuccessEvent event){
        log.info("susscess login again for user {}", event.getUser());
    }
}
