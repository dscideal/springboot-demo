package ${package.ServiceImpl};

import entity.StockFeeRule;
import mapper.StockFeeRuleMapper;
import .IStockFeeRuleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 费用计算规则设置表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockFeeRuleServiceImpl extends ${superServiceImplClass}<StockFeeRuleMapper, StockFeeRule> implements IStockFeeRuleService {

}
