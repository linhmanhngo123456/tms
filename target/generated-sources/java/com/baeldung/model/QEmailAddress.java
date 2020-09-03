package com.baeldung.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmailAddress is a Querydsl query type for EmailAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmailAddress extends EntityPathBase<EmailAddress> {

    private static final long serialVersionUID = -1947988210L;

    public static final QEmailAddress emailAddress = new QEmailAddress("emailAddress");

    public final StringPath id = createString("id");

    public final StringPath value = createString("value");

    public QEmailAddress(String variable) {
        super(EmailAddress.class, forVariable(variable));
    }

    public QEmailAddress(Path<? extends EmailAddress> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmailAddress(PathMetadata metadata) {
        super(EmailAddress.class, metadata);
    }

}

