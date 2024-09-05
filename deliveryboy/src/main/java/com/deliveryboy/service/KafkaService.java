package com.deliveryboy.service;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.sterotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> KafkaTemplate;

    private Logger logger=LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        this.KafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        this.logger.info("message produced");
        return true;

    }

}
