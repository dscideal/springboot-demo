package ${package.ServiceImpl};

import entity.StockFeeCompute;
import mapper.StockFeeComputeMapper;
import .IStockFeeComputeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 费用结算单主表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockFeeComputeServiceImpl extends ${superServiceImplClass}<StockFeeComputeMapper, StockFeeCompute> implements IStockFeeComputeService {

}
