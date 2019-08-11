package ssm.Dao;

import org.mybatis.spring.annotation.MapperScan;
import ssm.entity.studentDto;

import java.util.List;

/**
 * Created by Administrator on 2019-5-26.
 */
public interface student {

   public List<studentDto> selectAll();

}
