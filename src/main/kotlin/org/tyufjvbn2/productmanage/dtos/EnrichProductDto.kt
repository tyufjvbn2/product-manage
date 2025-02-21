package org.tyufjvbn2.productmanage.dtos

data class EnrichProductDto(
    val id: Int,
    val category_id: Int,
    val category_name: String,
    val brand_id: Int,
    val brand_name: String,
    val price: Int
)
