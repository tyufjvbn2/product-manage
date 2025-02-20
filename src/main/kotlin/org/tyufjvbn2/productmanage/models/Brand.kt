package org.tyufjvbn2.productmanage.models

import jakarta.persistence.*

@Entity
@Table(name = "brands")
data class Brand(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var name: String
)