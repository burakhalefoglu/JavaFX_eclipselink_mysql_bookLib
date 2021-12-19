module com.db.eclipslink {
    requires jakarta.persistence;
    requires org.eclipse.persistence.jpa;

    opens com.db.eclipslink.models;
    opens com.db.eclipslink.business;
    opens com.db.eclipslink.controller;
    opens com.db.eclipslink.repository;
    exports com.db.eclipslink.controller;
    exports com.db.eclipslink.business;
    exports com.db.eclipslink.repository;
    exports com.db.eclipslink.models;
    exports com.db.eclipslink.core.result;
}