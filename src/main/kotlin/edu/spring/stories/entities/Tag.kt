package edu.spring.stories.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

@Entity
open class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id = 0;
    @Column
    open var color : String? = null;
    constructor(color:String , label : String) {
        this.color = color
        this.label = label
    }
    @ManyToMany
    var label : String? = null
}