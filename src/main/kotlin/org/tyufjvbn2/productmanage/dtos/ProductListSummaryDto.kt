package org.tyufjvbn2.productmanage.dtos

data class ProductListSummaryDto(
    val products: List<EnrichProductDto>,
    val totalPrice: Int
)
