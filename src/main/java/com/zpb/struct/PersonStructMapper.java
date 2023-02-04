package com.zpb.struct;

import com.zpb.model.PersonDTO;
import com.zpb.model.PersonVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author       pengbo.zhao
 * @description  person 转换类
 * @createDate   2021/8/4 14:04
 * @updateDate   2021/8/4 14:04
 * @version      1.0
 */
@Mapper
public interface PersonStructMapper {

    /**
     * dto --> vo
     * @param personDTO dto
     * @return vo
     */
    @Mapping(source = "name",target = "nickname")
    @Mapping(target = "description",ignore = true)
    PersonVO personDtoToVO(PersonDTO personDTO);

}
