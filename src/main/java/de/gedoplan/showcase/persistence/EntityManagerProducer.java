package de.gedoplan.showcase.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// This EntityManager producer is used in JEE applications only - it is ignored for Quarkus

@ApplicationScoped
public class EntityManagerProducer {

  @PersistenceContext
  @Produces
  EntityManager entityManager;
}
