package com.universidad.hexagonal.config;

import com.universidad.hexagonal.domain.port.out.ProductoRepositoryPort;
import com.universidad.hexagonal.domain.service.ProductoDomainService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class BeanConfiguration {
    @Bean
    public ProductoDomainService productoDomainService(ProductoRepositoryPort repositoryPort) {
        return new ProductoDomainService(repositoryPort);
    }
}
