package ${package.Controller};



/**
 * 中移物流的库存数量 前端控制器
 *
 * @author yanggw
 * @since 2018-06-17
 */

@RestController
@RequestMapping("stock/locationSku")
@Transactional
public class StockIotLisProductController extends BaseController {

    /**
     * 仓位商品设置 分页查询
     * @param req
     * @return
     */
    @RequestMapping(value = "/queryPageList", method = { RequestMethod.POST })
    @ResponseBody
    public ResponseMessage stockLocationSkuQueryPageList(@RequestBody @Valid StockLocationSkuQueryPageListReq req) {
        ResponseMessage responseMessage = new ResponseMessage();
        Map param = new HashMap();
        param.put("pageNo",req.getPageNo());
        param.put("pageSize",req.getPageSize());
        param.put("searchKey",req.getSearchKey());
        Page<StockLocationSkuModel> page = (Page<StockLocationSkuModel>)skuService.stockLocationSkuQueryPageList(param);
        PageModel pageModel = new PageModel();
        pageModel.setResult(page.getResult());
        pageModel.setPageSize(page.getPageSize());
        pageModel.setTotalCount(page.getTotal());
        pageModel.setPageNo(page.getPageNum());
        responseMessage.setData(pageModel);
        return responseMessage;
    }

}
