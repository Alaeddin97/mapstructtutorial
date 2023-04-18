package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.SimpleSource;
import com.example.mapstruct.entity.SimpleDestination;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
