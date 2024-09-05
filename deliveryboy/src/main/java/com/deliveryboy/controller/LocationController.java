package com.deliveryboy.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService KafkaService;
    
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        this.kafkaService.updateLocation("("+Math.round(Math.random()*100)+ "," +Math.random.(Math.random()*100)+ ")")
        return new ResponseEntity<>(Map.of(k1:"message",v1:"Location updated"),HttpStatus.OK)
    }

}
