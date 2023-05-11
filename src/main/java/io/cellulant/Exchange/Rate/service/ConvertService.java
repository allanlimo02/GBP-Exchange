package io.cellulant.Exchange.Rate.service;

import io.cellulant.Exchange.Rate.dto.ConvertRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@Slf4j
public class ConvertService {

    @Value("${ENDPOINT_URL}")
    private String rapid_endpoint;

    @Value("${API_KEY}")
    private String rapid_apikey;

    public double convertAmount(ConvertRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-key", rapid_apikey);
        headers.add("x-rapidapi-host", "currency-exchange.p.rapidapi.com");
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(rapid_endpoint)
                .queryParam("from", request.getFrom())
                .queryParam("to", request.getTo())
                .queryParam("q", request.getAmount());

        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<String> responseEntity = new RestTemplate().exchange(
                builder.build().toUri(),
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            String responseBody = responseEntity.getBody();
            log.info("Converted Successfully ");
            return Double.parseDouble(responseBody);
        } else {
            log.info("Failed to convert currency");
            throw new RuntimeException("Failed to convert currency");
        }
    }
}
