package com.example.springshop.dto;

import com.example.springshop.domain.CategoryStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.springshop.domain.Category} entity
 */
@Data
public class CategoryDto implements Serializable {
    private Long id;
    @NotEmpty(message = "Categories name is required")
    private String name;
    private CategoryStatus status;
}