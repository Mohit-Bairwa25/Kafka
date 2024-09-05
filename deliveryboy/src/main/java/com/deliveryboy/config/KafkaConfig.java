package com.deliveryboy.config;

import org.*;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){

        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
                // .partitions()
                // .replicas
                .build();
    }    
}
