package org.tyufjvbn2.productmanage.infrastructure.db.jpa

import org.springframework.data.jpa.repository.JpaRepository
import org.tyufjvbn2.productmanage.infrastructure.db.entity.BrandEntity

interface JpaBrandRepository : JpaRepository<BrandEntity, Int>