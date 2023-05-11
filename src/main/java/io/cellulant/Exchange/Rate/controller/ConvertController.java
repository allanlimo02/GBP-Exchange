package io.cellulant.Exchange.Rate.controller;

import io.cellulant.Exchange.Rate.dto.ConvertRequest;
import io.cellulant.Exchange.Rate.service.ConvertService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ConvertController {

    @Autowired
    ConvertService convertService;
    @PostMapping("/convert")
    public double convert(@RequestBody ConvertRequest request) {
        log.info(request.getFrom()+" to "+ request.getTo()+" conversion has been processed successfully");
        return convertService.convertAmount(request);
    }
}

