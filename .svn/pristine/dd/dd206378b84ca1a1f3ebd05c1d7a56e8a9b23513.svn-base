package turing.manage.search;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import turing.dao.Dao;
import turing.dao.DaoImpl;

public class SearchServiceImpl implements ISearchService{

	Dao dao = new DaoImpl();

	//根据标签进行搜索
	@Override
	public List<Map<String, Object>> search(String key) throws ClassNotFoundException, SQLException {
		List<Map<String, Object>> list=dao.executeQueryForList("select * from tag");
		List<Integer> arr=new ArrayList<Integer>();
		//遍历查找存在的标签
		for(int i=0;i<list.size();i++){
			Map<String,Object> map=list.get(i);
			String va=(String) map.get("tag_name");
			int fa=key.indexOf((String)va);
				if(fa!=-1){
					arr.add((Integer) map.get("tag_id"));
				}
		}
		//保存最终数据的数组
		List<Map<String, Object>> searchlist=new ArrayList<>();
		
		List<Map<String, Object>> List_tag=new ArrayList<>();
		
		for(int i=0;i<arr.size();i++){
			
			List<Map<String, Object>> ls_tag=dao.executeQueryForList("select * from tag_list where tag_id =?",new int[]{Types.INTEGER},new Object[]{arr.get(i)});
			
			List_tag.addAll(ls_tag);
			//将含有所有标签的商品写入
		}
		int flag=0;
		List<Map<String, Object>> ls=dao.executeQueryForList(" SELECT * FROM commodity ");
		
		
		
		for(int i=0;i<ls.size();i++){
			for(int k=0;k<arr.size();k++){
			
			for(int j=0;j<List_tag.size();j++){
				//第一个条件，商品id相同
				Boolean flag1=ls.get(i).get("commodity_id").equals(List_tag.get(j).get("commodity_id"));
				//第二个条件，tagid相同
				Boolean flag2=arr.get(k).equals(List_tag.get(j).get("tag_id"));
				//满足两个条件，flag+1，当flag和arr的长度相同，添加入最终数据表
				if(flag1&flag2){
					flag+=1;
				}
			}
			}
			if(flag==arr.size()){
				searchlist.add(ls.get(i));
				flag=0;
			}
			else {
				flag=0;
			}
		}
		return searchlist;
	}
}
