package hnr.belajarSpring.core.serivce;

import hnr.belajarSpring.core.Repository.CustumerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustumerService {

    @Getter
    @Autowired
    @Qualifier("normalCustumerRepository")
    private CustumerRepository normalCustumerRepository;

    @Getter
    @Autowired
    @Qualifier("premiumCustumerRepository")
    private CustumerRepository premiumCustumerRepository;

}
