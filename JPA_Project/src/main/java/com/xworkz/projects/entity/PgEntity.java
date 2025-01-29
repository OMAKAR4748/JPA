package com.xworkz.projects.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "PGEntity")
@NamedQuery(name = "getAllData", query = "select p from PgEntity p")
@NamedQuery(name = "getByName",query = "select p from PgEntity p where p.name=:name")
@NamedQuery(name = "getById",query = "select p from PgEntity p where p.id=:id")
@NamedQuery(name = "updateByName" ,query = "update PgEntity p set p.location=:location where p.name=:name")
@NamedQuery(name = "updateById" ,query = "update PgEntity p set p.location=:location where p.id=:id")
//@NamedQuery(name = "getIdByLocation", query = "select p.location from PgEntity p where p.id=:id")
//@NamedQuery(name = "IdByLocationAndName",query = "select p.location,p.name from PgEntity p where p.id=:id")
//@NamedQuery(name = "getDataIdByLocation",query = "SELECT p.id FROM PgEntity p WHERE p.location = :location")
@NamedQuery(name = "getidbylocation",query = "SELECT p.id FROM PgEntity p WHERE p.location = :location")
@NamedQuery(name = "getlocationbyname",query = "SELECT p.location FROM PgEntity p WHERE p.name =:name")
//@NamedQuery(name = "getlocationAndrentbyname",query = "SELECT new PgEntity(p.location, p.rent) FROM PgEntity p WHERE p.name = ?1" )
//@NamedQuery(name = "getlocationNameAndrentByid", query = "SELECT new PgEntity(p.location, p.name, p.rent) FROM PgEntity p WHERE p.id = ?1")
public class PgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    private String location;
    private Long phoneNumber;
    private Double rent;
}
