package com.baeldung.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAction is a Querydsl query type for Action
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAction extends EntityPathBase<Action> {

    private static final long serialVersionUID = 1269277964L;

    public static final QAction action = new QAction("action");

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.time.ZonedDateTime> time = createDateTime("time", java.time.ZonedDateTime.class);

    public QAction(String variable) {
        super(Action.class, forVariable(variable));
    }

    public QAction(Path<? extends Action> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAction(PathMetadata metadata) {
        super(Action.class, metadata);
    }

}

