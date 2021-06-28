package com.seven.jong.VO.hosting;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccommodationTempVO {

    private Integer accommodationId;
    private Integer userId;
    private String name;
    private String address;
    private String type;
    private Integer maxNumberOfGuest;
    private Integer numberOfBedroom;
    private Integer numberOfBed;
    private String typeOfBed;
    private Integer numberOfBathroom;
    private Integer contactNumber;
    private Integer price;
    private String description;
    private LocalDateTime regDate;


}
