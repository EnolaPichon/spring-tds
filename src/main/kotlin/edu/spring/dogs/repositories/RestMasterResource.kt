package edu.spring.dogs.repositories

import edu.spring.dogs.entities.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "masters", path = "masters")
interface RestMasterResource: JpaRepository<Master, Int> {
}