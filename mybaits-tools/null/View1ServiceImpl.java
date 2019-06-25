package ${package.ServiceImpl};

import entity.View1;
import mapper.View1Mapper;
import .IView1Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class View1ServiceImpl extends ${superServiceImplClass}<View1Mapper, View1> implements IView1Service {

}
