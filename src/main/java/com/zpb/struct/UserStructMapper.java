package com.zpb.struct;

import com.zpb.constants.MapstructConstant;
import com.zpb.model.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


/**
 * @author       pengbo.zhao
 * @description  用户-转换类2
 * @createDate   2021/7/31 16:14
 * @updateDate   2021/7/31 16:14
 * @version      1.0
 */
// @Mapper(componentModel = "spring",uses = WeightStructMapper.class)
@Mapper(componentModel = "spring")
public interface UserStructMapper {

    /**
     * user dto --> vo
     * @param userDTO dto
     * @return vo
     */
    @Mapping(source = "name1",target = "name2")
    @Mapping(source = "age1",target = "age2",ignore = true)
    // @Mapping(source = "height1",target = "height2",qualifiedByName = "heightConvert")
    @Mapping(source = "height1",target = "height2")
    // @Mapping(source = "weight1",target = "weight2",qualifiedByName = "weightConvert")
    @Mapping(source = "weight1",target = "weight2")
    // @Mapping(source = "sex1",target = "sex2",qualifiedByName = "sexEnumToStringConvert")
    @Mapping(source = "sex1",target = "sex2")
    @Mapping(source = "userDTO.address.province",target = "province")
    @Mapping(source = "createTime1",target = "createTime2",dateFormat = "yyyy-MM-dd HH:mm:ss:SSS")
    @Mapping(source = "updateTime1",target = "updateTime2",dateFormat = "yyyy-MM-dd HH:mm")
    @Mapping(target = "bloodType2",constant = MapstructConstant.BLOOD_A)
    @Mapping(source = "salary1",target = "salary2",numberFormat = "#.00元")
    @Mapping(source = "caseDough1",target = "caseDough2",numberFormat = "#")
    UserVO userDtoToVO(UserDTO userDTO);

    /**
     * 身高转换
     * @param height height
     * @return double
     */
    @Named("heightConvert")
    default Double heightConvert(Long height){
        return height * 1.0 / 100;
    }

    /**
     * 体重转换
     * @param weight weight
     * @return string
     */
    @Named("weightConvert")
    default String weightConvert(Integer weight){
        return (weight * 2) + "斤";
    }


    /**
     * 性别转换
     * @param sexEnum enum
     * @return String
     */
    @Named("sexEnumToStringConvert")
    default String sexEnumToStringConvert(SexEnum sexEnum){
        return sexEnum.getDesc();
    }

    /**
     * 性别转换
     * @param sex String
     * @return SexEnum
     */
    default SexEnum sexEnumConvert(String sex){
        for(SexEnum sexEnum : SexEnum.values()){
            if (sexEnum.getDesc().equals(sex)){
                return sexEnum;
            }
        }
        return null;
    }

    /**
     * user vo -> dto
     * @param userVO vo
     * @return dto
     */
    @InheritInverseConfiguration(name = "userDtoToVO")
    @Mapping(source = "bloodType2",target = "bloodType1")
    @Mapping(source = "sex2",target = "sex1")
    UserDTO userVoToDTO(UserVO userVO);


    /**
     * 转换user
     * @param userDetail userDetail
     * @param userPo userPo
     * @return user
     */
    @Mapping(source = "userDetail.id",target = "userDetailId")
    @Mapping(source = "userPo.id",target = "userPoId")
    User toUser(UserDetail userDetail, UserPO userPo);

    /**
     * 转换user
     * @param userDetailId userDetailId
     * @param userPoId userPoId
     * @return user
     */
    @Mapping(source = "userDetailId",target = "userDetailId")
    @Mapping(source = "userPoId",target = "userPoId")
    User toUser(Long userDetailId, Long userPoId);



}
