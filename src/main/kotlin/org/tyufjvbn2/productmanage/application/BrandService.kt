package org.tyufjvbn2.productmanage.application

import org.springframework.stereotype.Service
import org.tyufjvbn2.productmanage.domain.model.Brand
import org.tyufjvbn2.productmanage.domain.repository.BrandRepository

@Service
class BrandService(private val brandRepository: BrandRepository) {
    fun getAllBrands(): List<Brand> = brandRepository.findAll()
}