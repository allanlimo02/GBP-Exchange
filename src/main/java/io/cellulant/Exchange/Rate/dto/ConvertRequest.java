package io.cellulant.Exchange.Rate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConvertRequest {
    private String from;
    private String to;
    private int amount;
}
