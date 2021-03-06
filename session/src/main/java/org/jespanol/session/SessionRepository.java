package org.jespanol.session;

import jakarta.nosql.mapping.Repository;

import java.util.List;

public interface SessionRepository extends Repository<Session, String> {

    List<Session> findAll();
}
