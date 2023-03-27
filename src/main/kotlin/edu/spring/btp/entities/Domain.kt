package edu.spring.btp.entities

import jakarta.persistence.*

@Entity
class Domain() {
    constructor(name: String, parent: Domain?) : this() {
        this.name = name
        this.parent = parent
    }

    fun getComplaintsCount (domains : Domain) : Int {
        var nombre : Int = 0
        for (children in children ) {
            if (children.parent == domains) {
                nombre += 1
            }
        }
        return nombre
    }

    fun hasChildren (domains : Domain) : Boolean{
        for (children in children ) {
            if (children.parent == domains) {
                return true
            }
        }
        return false
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id = 0

    @Column(length = 50, unique = true, nullable = false)
    open var name: String? = null

    @Lob
    open var description: String? = null

    @ManyToOne(optional = true)
    @JoinColumn(name = "parent_id")
    open var parent:Domain? = null

    @OneToMany(mappedBy = "parent")
    open var children= mutableListOf<Domain>()

    @ManyToMany(mappedBy = "domains")
    open var providers= mutableListOf<Provider>()

    @OneToMany(mappedBy = "domain")
    open var complaints= mutableListOf<Complaint>()

}