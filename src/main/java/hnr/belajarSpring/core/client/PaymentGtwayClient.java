package hnr.belajarSpring.core.client;

import lombok.Data;

@Data
public class PaymentGtwayClient {

    private String endPoint;

    private String privateKey;

    private String publicKey;

}
