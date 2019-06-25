package ${package.ServiceImpl};

import entity.StockPerOutSheetAddress;
import mapper.StockPerOutSheetAddressMapper;
import .IStockPerOutSheetAddressService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单次出库地址表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockPerOutSheetAddressServiceImpl extends ${superServiceImplClass}<StockPerOutSheetAddressMapper, StockPerOutSheetAddress> implements IStockPerOutSheetAddressService {

}
