package ${package.ServiceImpl};

import entity.StockProductLock;
import mapper.StockProductLockMapper;
import .IStockProductLockService;
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
public class StockProductLockServiceImpl extends ${superServiceImplClass}<StockProductLockMapper, StockProductLock> implements IStockProductLockService {

}
