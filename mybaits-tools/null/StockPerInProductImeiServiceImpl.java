package ${package.ServiceImpl};

import entity.StockPerInProductImei;
import mapper.StockPerInProductImeiMapper;
import .IStockPerInProductImeiService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockPerInProductImeiServiceImpl extends ${superServiceImplClass}<StockPerInProductImeiMapper, StockPerInProductImei> implements IStockPerInProductImeiService {

}
