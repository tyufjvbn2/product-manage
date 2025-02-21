package org.tyufjvbn2.productmanage.services

import org.springframework.stereotype.Service
import org.tyufjvbn2.productmanage.dtos.ProductListSummaryDto
import org.tyufjvbn2.productmanage.repositories.ProductRepository

@Service
class ProductService(val productRepository: ProductRepository) {
    fun getLowestProduct (): ProductListSummaryDto {
        val products = productRepository.findLowestPriceProductByCategory()
        val total_price = products.sumOf { it.price }
        return ProductListSummaryDto(products, total_price)

    }
}