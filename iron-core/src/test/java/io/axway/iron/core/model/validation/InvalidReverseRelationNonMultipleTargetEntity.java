package io.axway.iron.core.model.validation;

import io.axway.iron.description.Entity;

@Entity
public interface InvalidReverseRelationNonMultipleTargetEntity {
    default InvalidReverseRelationNonMultipleEntity reverse() {
        return null;
    }
}
