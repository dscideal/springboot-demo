package ${package.ServiceImpl};

import entity.StockFeeImportData;
import mapper.StockFeeImportDataMapper;
import .IStockFeeImportDataService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物流费用导入数据表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockFeeImportDataServiceImpl extends ${superServiceImplClass}<StockFeeImportDataMapper, StockFeeImportData> implements IStockFeeImportDataService {

}
