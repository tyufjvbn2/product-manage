package org.tyufjvbn2.productmanage.services

import org.springframework.stereotype.Service
import org.tyufjvbn2.productmanage.models.Brand
import org.tyufjvbn2.productmanage.repositories.BrandRepository

@Service
class BrandService(val brandRepository: BrandRepository) {
    fun getAllBrands(): List<Brand> {
        return brandRepository.findAll()
    }
}