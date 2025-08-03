package org.example.ecommercespring.mappers;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;

import java.util.List;

public class GetAllCategoriesMapper {

    public static FakeStoreCategoryResponseDTO toFakeStoreCategoryDTO() {
        return null;
    }

    public static List<CategoryDTO> toCategoryDTO(FakeStoreCategoryResponseDTO dto) {

        return dto.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
