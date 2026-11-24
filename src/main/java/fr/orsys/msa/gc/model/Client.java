package fr.orsys.msa.gc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *     id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
 *     firstname  VARCHAR(255) NOT NULL,
 *     lastname   VARCHAR(255) NOT NULL,
 *     address    VARCHAR(255),
 *     city       VARCHAR(255),
 *     zip_code
 *
 */
@Data
@Entity
public class Client {

    @Id
    public Integer id;

    public String lastname;
    public String firstname;
    public String address;
    public String city;
    public String zipCode;

}
