import com.zpb.MapstructApplication;
import com.zpb.model.PersonDTO;
import com.zpb.model.PersonVO;
import com.zpb.model.SexEnum;
import com.zpb.struct.PersonStructMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author       pengbo.zhao
 * @description  mapstruct-测试
 * @createDate   2021/8/4 13:50
 * @updateDate   2021/8/4 13:50
 * @version      1.0
 */
@SpringBootTest(classes = {MapstructApplication.class})
class MapstructTest {

    @Resource
    private PersonStructMapper personStructMapper;

    @Test
    @DisplayName("person dto ---> vo")
    void testPersonDTOtoVO(){
        PersonDTO personDTO = new PersonDTO("张三", 23, "这是张三呀");
        PersonVO personVO = personStructMapper.personDtoToVO(personDTO);
        System.err.println(personVO);
    }

    @Test
    void test(){
        SexEnum value = Enum.valueOf(SexEnum.class, "男");
        System.err.println(value);
    }










}
