package demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

/**
 * 封装分页标签
 * @param dm
 * @return
 */
public class PageRequestTools {

/**
 * 返回分页信息封装对象 查询使用
 * @param dm
 * @return
 */
public static PageRequest pageRequesMake(QueryModel dm)

{	
	//排序字段
	if (StringUtil.isEmpty(dm.getSort()) ){
		dm.setSort("ctime");
	}
	//排序方式 默认DESC
	Direction d = Direction.DESC;
	if(dm.getMode().equalsIgnoreCase("ASC")){
		d = Direction.ASC;
	}
	Sort st = new Sort(d,dm.getSort());
	
   return new PageRequest(dm.getN(),dm.getS(),st);
}

public static PageRequest pageRequesMake(QueryModelMul dm)

{	
	//排序字段
	List<String> sortList = dm.getSort();
	if (sortList==null){
		//tang 添加一行
		sortList=new ArrayList<String>();
		sortList.add("ctime");
		dm.setSort(sortList);
	}
	//排序方式 默认DESC
	Direction d = Direction.DESC;
	if(dm.getMode().equalsIgnoreCase("ASC")){
		d = Direction.ASC;
	}
	Sort st = new Sort(d,dm.getSort());
	
   return new PageRequest(dm.getN(),dm.getS(),st);
}

	/**
	 * 
	 * @auther tangli
	 * @Description: 支持多字段不同升降序 排序分页实现
	 * @param dm
	 * @return PageRequest
	 * @Date:2015年4月23日
	 * @throws
	 */
	public static PageRequest pageRequesMake(QueryModelMulSD dm) {		
		String[] sords = dm.getSd().split(",");
		List<Order> orders = new ArrayList<Order>();
		for (String string : sords) {
			String[] buffer = string.split(":");
			if (buffer.length == 2) {
				Direction direction = Direction.DESC;
				if ("ASC".equals(StringUtil.toUpperCase(buffer[1]))) {
					direction = Direction.ASC;
				}
				Order order = new Order(direction, buffer[0]);
				orders.add(order);
			}
		}
		Sort sort = new Sort(orders);
		return new PageRequest(dm.getN(), dm.getS(), sort);
	}

}
