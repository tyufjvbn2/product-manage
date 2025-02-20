package org.tyufjvbn2.productmanage.models

import jakarta.persistence.*

@Entity
@Table(name = "products")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var brand_id: Int,
    var category_id: Int,
    var price: Int
)
