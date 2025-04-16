package io.github.pmypadi.config;

import io.github.pmypadi.domain.Command;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class StorageConfiguration {
    @Value("${storage.path}:/tmp")
    private String storagePath;

    @Value("${storage.initial.size}:1024")
    private long initialSize;

    @Value("${storage.max.size}:102400")
    private long maxSize;


    @Bean
    public Map<String, Command> commands() {
        return new ConcurrentHashMap<>();
    }
}

