package edu.spring.stories.repositories

import edu.spring.stories.entities.Tag
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository : CrudRepository <Tag, Int>{
    public fun findByColor (couleur : String) : MutableList<Tag>
}