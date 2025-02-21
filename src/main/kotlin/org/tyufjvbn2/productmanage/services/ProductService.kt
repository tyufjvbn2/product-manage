package org.tyufjvbn2.productmanage.services

import org.springframework.stereotype.Service
import org.tyufjvbn2.productmanage.dtos.EnrichProductDto
import org.tyufjvbn2.productmanage.dtos.ProductListSummaryDto
import org.tyufjvbn2.productmanage.models.Product
import org.tyufjvbn2.productmanage.repositories.CategoryRepository
import org.tyufjvbn2.productmanage.repositories.ProductRepository

@Service
class ProductService(
    val productRepository: ProductRepository,
    val categoryRepository: CategoryRepository
    ) {
    fun getLowestProduct (): ProductListSummaryDto {
        val products = productRepository.findLowestPriceProductByCategory()
        val totalPrice = products.sumOf { it.price }

        val categories = categoryRepository.findAll()

        val processedProducts = categories.map { category ->
            val product = products.find { it.category_id == category.id }
            if(product == null) {
                EnrichProductDto(id=0, category_id = category.id, category_name = category.name, brand_id = 0, brand_name="없음", price = 0)
            }
            else {
                product
            }
        }

        return ProductListSummaryDto(processedProducts, totalPrice)

    }
}