package hnr.belajarSpring.core.factory;

import hnr.belajarSpring.core.client.PaymentGtwayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGtwayClient")
public class PaymentGetwayClientFactory implements FactoryBean<PaymentGtwayClient> {
    @Override
    public PaymentGtwayClient getObject() throws Exception {
        PaymentGtwayClient client = new PaymentGtwayClient();
        client.setEndPoint("http://example");
        client.setPrivateKey("private");
        client.setPublicKey("public");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGtwayClient.class;
    }
}
