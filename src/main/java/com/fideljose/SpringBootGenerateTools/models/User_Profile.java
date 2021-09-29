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
public class User_Profile {
    private Integer id;
    private User_Profile user_profile;
}
