package com.fideljose.SpringBootGenerateTools.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Component
public class Address {
    private Integer id;
    private String description;
}
