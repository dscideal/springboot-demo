package ${package.ServiceImpl};

import entity.StockAllotApplyOrder;
import mapper.StockAllotApplyOrderMapper;
import .IStockAllotApplyOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 调拨表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockAllotApplyOrderServiceImpl extends ${superServiceImplClass}<StockAllotApplyOrderMapper, StockAllotApplyOrder> implements IStockAllotApplyOrderService {

}
