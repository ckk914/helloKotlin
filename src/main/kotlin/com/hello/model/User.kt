package com.hello.model

import javax.persistence.*

@Entity
@Table(name = "users") // 테이블 이름 지정
public class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    val username: String,

    @Column(nullable = false)
    val password: String
)