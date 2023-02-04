import com.zpb.MapstructApplication;
import com.zpb.model.*;
import com.zpb.struct.UserStructMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author       pengbo.zhao
 * @description  user dto --> vo 测试
 * @createDate   2021/8/5 15:02
 * @updateDate   2021/8/5 15:02
 * @version      1.0
 */
@SpringBootTest(classes = {MapstructApplication.class})
class UserStructMapperTest {

    private UserDTO userDto;

    @Resource
    private UserStructMapper userStructMapper;

    @Test
    @DisplayName("user dto ---> vo")
    void testUserDtoToVo(){
        UserVO userVO = userStructMapper.userDtoToVO(userDto);
        System.err.println(userVO);
        Assertions.assertTrue(true);
    }


    @Test
    @DisplayName("user dto construct")
    @BeforeEach
    void testUserDto(){
        UserDTO userDto = new UserDTO();
        userDto.setId("0001");
        userDto.setName1("张三");
        userDto.setAge1("18");
        userDto.setHeight1(183L);
        userDto.setWeight1(70);
        userDto.setSex1(SexEnum.MAN);
        userDto.setCreateTime1(new Date());
        userDto.setUpdateTime1("2021-08-05 16:37:05:555");
        userDto.setBloodType1('A');
        userDto.setSalary1(28.09888888888);
        userDto.setCaseDough1("1.08888888888");
        userDto.setAddress(new Address("北京市", "北京市", "昌平区", "大屯路街道"));
        this.userDto = userDto;
        System.err.println("-----------");
        Assertions.assertTrue(true);
    }

    @Test
    void testUser(){
        UserDetail userDetail = new UserDetail(11);
        UserPO userPO = new UserPO(22);
        User user = userStructMapper.toUser(userDetail, userPO);
        System.err.println(user);
        Assertions.assertTrue(true);
    }

    @Test
    void testUser2(){
        User user = userStructMapper.toUser(33L, 44L);
        System.err.println(user);
        Assertions.assertTrue(true);
    }

    @Test
    void testUserDTO(){
        UserVO userVO = new UserVO();
        userVO.setId("0001");
        userVO.setName2("张三");
        userVO.setAge2(18);
        userVO.setHeight2(70.0d);
        userVO.setWeight2("140");
        userVO.setSex2("男");
        userVO.setCreateTime2("2021-08-05 16:37:05:555");
        userVO.setUpdateTime2(new Date());
        userVO.setBloodType2("A");
        userVO.setCaseDough2(1);
        userVO.setProvince("北京市");


        UserDTO userDTO = userStructMapper.userVoToDTO(userVO);
        System.err.println(userDTO);
        Assertions.assertTrue(true);
    }
}
