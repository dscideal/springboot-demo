package ${package.ServiceImpl};

import entity.StockFee;
import mapper.StockFeeMapper;
import .IStockFeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物流费用表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockFeeServiceImpl extends ${superServiceImplClass}<StockFeeMapper, StockFee> implements IStockFeeService {

}
