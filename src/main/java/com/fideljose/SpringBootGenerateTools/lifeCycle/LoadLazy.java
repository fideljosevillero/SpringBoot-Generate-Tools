package com.fideljose.SpringBootGenerateTools.lifeCycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = true)
public class LoadLazy {
}
