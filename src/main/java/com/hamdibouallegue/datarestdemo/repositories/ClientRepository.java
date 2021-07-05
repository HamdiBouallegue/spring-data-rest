package com.hamdibouallegue.datarestdemo.repositories;

import com.hamdibouallegue.datarestdemo.models.Client;
import com.hamdibouallegue.datarestdemo.models.projections.ClientDetailView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


// Using the @RestResource(exported = false) won’t expose this repository.
//@RestResource(exported = false)

/* We add the @RepositoryRestResource annotation and we specified the path
   collectionResourceRel used to change the path in the embedded
*/
@RepositoryRestResource(path = "clients_objects",collectionResourceRel = "clients_path",excerptProjection = ClientDetailView.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);
}
