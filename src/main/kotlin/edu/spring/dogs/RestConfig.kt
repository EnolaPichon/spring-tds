package edu.spring.dogs

import edu.spring.dogs.entities.Dog
import edu.spring.dogs.entities.Master
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.context.annotation.Configuration

@Configuration
class RestConfig: RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?, cors: CorsRegistry?) {
        config?.exposeIdsFor(Master::class.java, Dog::class.java)
    }
}