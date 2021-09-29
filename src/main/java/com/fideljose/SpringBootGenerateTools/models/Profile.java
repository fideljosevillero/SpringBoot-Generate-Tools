package com.fideljose.SpringBootGenerateTools.models;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Profile {

    final static Logger logger = LoggerFactory.getLogger(Profile.class);
    private Integer id;
    private String profileName;

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", profileName='" + profileName + '\'' +
                '}';
    }
}
