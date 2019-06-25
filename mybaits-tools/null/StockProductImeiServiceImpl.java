package ${package.ServiceImpl};

import entity.StockProductImei;
import mapper.StockProductImeiMapper;
import .IStockProductImeiService;
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
public class StockProductImeiServiceImpl extends ${superServiceImplClass}<StockProductImeiMapper, StockProductImei> implements IStockProductImeiService {

}
