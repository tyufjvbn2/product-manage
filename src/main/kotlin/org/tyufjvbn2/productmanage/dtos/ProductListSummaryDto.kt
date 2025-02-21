package org.tyufjvbn2.productmanage.dtos

data class ProductListSummaryDto(
    val products: List<EnrichProductDto>,
    val totalPrice: Int
)

data class ProductListSummaryWithBrandDto(
    val brandName: String,
    val products: List<HydratedProductDto>,
    val totalPrice: Int
)