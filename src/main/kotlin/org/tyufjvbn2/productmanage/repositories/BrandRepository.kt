package org.tyufjvbn2.productmanage.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.tyufjvbn2.productmanage.models.Brand

interface BrandRepository : JpaRepository<Brand, Int> {}