package ${package.ServiceImpl};

import entity.StockFeeComputeList;
import mapper.StockFeeComputeListMapper;
import .IStockFeeComputeListService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物流费用结算单明细表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockFeeComputeListServiceImpl extends ${superServiceImplClass}<StockFeeComputeListMapper, StockFeeComputeList> implements IStockFeeComputeListService {

}
