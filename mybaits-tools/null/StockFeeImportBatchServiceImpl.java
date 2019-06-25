package ${package.ServiceImpl};

import entity.StockFeeImportBatch;
import mapper.StockFeeImportBatchMapper;
import .IStockFeeImportBatchService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物流费用导入批次表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockFeeImportBatchServiceImpl extends ${superServiceImplClass}<StockFeeImportBatchMapper, StockFeeImportBatch> implements IStockFeeImportBatchService {

}
