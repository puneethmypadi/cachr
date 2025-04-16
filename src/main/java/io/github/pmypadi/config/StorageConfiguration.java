package io.github.pmypadi.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class StorageConfiguration {
    @Value("${storage.path}:/tmp")
    private String storagePath;

    @Value("${storage.initial.size}:1024")
    private long initialSize;

    @Value("${storage.max.size}:102400")
    private long maxSize;


}

