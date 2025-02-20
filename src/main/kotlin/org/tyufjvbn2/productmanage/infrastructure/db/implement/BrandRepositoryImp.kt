package org.tyufjvbn2.productmanage.infrastructure.db.implement

import org.springframework.stereotype.Repository
import org.tyufjvbn2.productmanage.domain.model.Brand
import org.tyufjvbn2.productmanage.domain.repository.BrandRepository
import org.tyufjvbn2.productmanage.infrastructure.db.jpa.JpaBrandRepository

@Repository
class BrandRepositoryImp(
    private val jpaRepository: JpaBrandRepository
): BrandRepository {
    override fun findAll(): List<Brand> {
        return jpaRepository.findAll().map { Brand(it.id, it.name) }
    }

//    override fun findById(id: Int): Brand? {
//        return jpaRepository.findById(id).map {Brand(it.id, it.name).orElse()}
//    }
}
