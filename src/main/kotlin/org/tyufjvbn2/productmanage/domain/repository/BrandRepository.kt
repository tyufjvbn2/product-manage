package org.tyufjvbn2.productmanage.domain.repository

import org.tyufjvbn2.productmanage.domain.model.Brand

interface BrandRepository {
    fun findAll(): List<Brand>
}