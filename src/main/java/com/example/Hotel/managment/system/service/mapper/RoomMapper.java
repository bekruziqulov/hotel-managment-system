/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:13.10.2024
 * TIME:19:10
 */
package com.example.Hotel.managment.system.service.mapper;

import com.example.Hotel.managment.system.entity.Room;
import com.example.Hotel.managment.system.service.dto.RoomDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoomMapper extends EntityMapper<RoomDto, Room> {
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    @Mapping(source = "roomType", target = "roomType")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "hotel.id", target = "hotelId")
    RoomDto toDto(Room room);

    @Mapping(source = "roomType", target = "roomType")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "hotelId", target = "hotel.id")
    Room toEntity(RoomDto roomDto);
}
