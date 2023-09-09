package com.example.Last.Assignment.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Address {
    @Id
    @SequenceGenerator(
            name = "Address_sequence",
            sequenceName = "Address_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Address_sequence")
    private Long id;
    private String BuildingNo;
    private String StreetName;
    private String City;
    private String State;

}
