package com.deliveryboy.service;  // Ensure this matches your folder structure

import org.slf4j.Logger;  // Correct the import
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstants;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location) {
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        this.logger.info("Message produced: {}", location);
        return true;
    }
}
