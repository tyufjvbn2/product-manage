package org.tyufjvbn2.productmanage.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.tyufjvbn2.productmanage.dtos.EnrichProductDto
import org.tyufjvbn2.productmanage.models.Product

interface ProductRepository: JpaRepository<Product, Int> {
    @Query("""
        WITH RankedProducts AS (
            SELECT p.id, c.id AS category_id, c.name AS category_name, b.id AS brand_id, b.name AS brand_name, p.price,
                   ROW_NUMBER() OVER (PARTITION BY p.category_id ORDER BY p.price ASC, p.brand_id ASC) AS rank
            FROM products p
            JOIN categories c ON p.category_id = c.id
            JOIN brands b ON p.brand_id = b.id
        )
        SELECT id, category_id, category_name, brand_id, brand_name, price
        FROM RankedProducts
        WHERE rank = 1;
    """, nativeQuery = true)
    fun findLowestPriceProductByCategory(): List<EnrichProductDto>
}