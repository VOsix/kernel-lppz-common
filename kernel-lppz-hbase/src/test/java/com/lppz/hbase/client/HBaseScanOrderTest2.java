//package com.lppz.hbase.client;
//
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//
//import org.apache.hadoop.hbase.client.coprocessor.agg.AggHandlerProxy.AggEnum;
//import org.apache.hadoop.hbase.client.coprocessor.agggroupby.AggGroupByHandlerProxy.AggGroupByEnum;
//import org.apache.hadoop.hbase.client.coprocessor.model.AggGroupResult;
//import org.apache.hadoop.hbase.client.coprocessor.model.AggResult;
//import org.apache.hadoop.hbase.client.coprocessor.model.ClassEnum;
//import org.apache.hadoop.hbase.client.coprocessor.model.ScanResult;
//import org.apache.hadoop.hbase.client.coprocessor.model.idx.HbaseDataType;
//import org.apache.hadoop.hbase.client.coprocessor.model.idx.OrderBy;
//import org.apache.hadoop.hbase.client.coprocessor.model.scan.CasCadeScanMap;
//import org.apache.hadoop.hbase.client.coprocessor.model.scan.CascadeCell;
//import org.apache.hadoop.hbase.client.coprocessor.model.scan.PagerList;
//import org.apache.hadoop.hbase.client.coprocessor.model.scan.ScanCascadeResult;
//import org.apache.hadoop.hbase.client.coprocessor.model.scan.ScanOrderedKV;
//import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
//import org.apache.hadoop.hbase.util.Bytes;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.lppz.hbase.client.impl.HBaseScanImpl;
//
//public class HBaseScanOrderTest2 extends BaseTest{
//	HBaseScanImpl hbs;
//	@Before
//	public void init(){
//		hbs=new HBaseScanImpl();
//		super.initConf();
//	}
//	@Test
//	public void testScanResultByRowKey() {
//		List<ScanOrderedKV> simpleCondList=new ArrayList<ScanOrderedKV>();
////		simpleCondList.add(new ScanOrderedKV("orderid","WM150731000000506",CompareOp.EQUAL));
////		simpleCondList.add(new ScanOrderedKV("outorderid","BJ15073031272283",CompareOp.EQUAL));
////		simpleCondList.add(new ScanOrderedKV("createdate","2015-07-31 23:59:34",CompareOp.LESS_OR_EQUAL));
////		simpleCondList.add(new ScanOrderedKV("createdate","2015-07-01 05:59:34",CompareOp.GREATER));
////		simpleCondList.add(new ScanOrderedKV("shad-name","150102",CompareOp.EQUAL));
////		simpleCondList.add(new ScanOrderedKV("shad-mobilephone","13121197805",CompareOp.EQUAL));
//		simpleCondList.add(new ScanOrderedKV("state","OUT$-$STORAGE",CompareOp.EQUAL));
//		CasCadeScanMap casCadeScanMap=new CasCadeScanMap();
////		List<ScanOrderedKV> olListScan=new ArrayList<ScanOrderedKV>();
////		olListScan.add(new ScanOrderedKV("sku","123",CompareOp.EQUAL));
////		casCadeScanMap.put("orderline",null);
//		long tStart = System.currentTimeMillis(); 
//		List<ScanResult> list=hbs.scanResultByRowKey("hbaseorder", "order", null, simpleCondList, null, 1000, casCadeScanMap);
//		long tEnd = System.currentTimeMillis(); 
//		System.out.println(tEnd - tStart + "millions");
//		System.out.println(list.size());
//		for(ScanResult sr:list){
//			//hbd.deleteAllColumn("omsorder", row);
//			ScanCascadeResult scr=sr.build();
//			Map<String,String> orderMap=scr.getSource().getQulifyerValueMap();
//			for(String s:orderMap.keySet()){
//				String v=orderMap.get(s);
//				System.out.println(s+"::"+v);
//			}
////			List<ScanCascadeResult> olList=scr.getCascadeMap().get("orderline");
////			if(olList!=null){
////				for(ScanCascadeResult scr1:olList){
////					System.out.println(Bytes.toString(scr1.getSource().getRow()));
////				}
////			}
////			Map<String,List<CascadeCell>> payship=hbs.scanResultByParentRowKey("payshipinfo", new String[]{"paymentinfo","shipment"}, Bytes.toString(scr.getSource().getRow()), "hbaseorder", "order", 100);
////			for(String key : payship.keySet()){				
////				System.out.println(key + "::" +payship.get(key));
////			}
//		}
//	}
//	
//	@Test
//	public void testIdxScanResultByRowKey() {
////		List<TreeMap<String, String>> complexScanCondList=new ArrayList<TreeMap<String, String>>();
////		TreeMap<String, String> tree1=new TreeMap<String, String>();
////		tree1.put("auid", "u000000539");
////		TreeMap<String, String> tree2=new TreeMap<String, String>();
////		tree2.put("auid", "u000000912");
////		complexScanCondList.add(tree1);
////		complexScanCondList.add(tree2);
////		long tStart = System.currentTimeMillis(); 
////		List<ScanResult> list=hbs.scanResultByRowKey("idx_omsorder", "orderdetail", null, null, complexScanCondList, 5, null);
////		long tEnd = System.currentTimeMillis(); 
////		System.out.println(tEnd - tStart + "millions");
////		System.out.println(list.size());
////		for(ScanResult sr:list){
////			String auid=Bytes.toString(sr.build().getSource().getRow());
////			System.out.println("auid:"+auid);
//////			List<ScanCascadeResult> ll=sr.build().getCascadeMap().get("orderline");
//////			System.out.println(ll.size());
//////			for(ScanCascadeResult scr:ll){
//////				System.out.println(Bytes.toString(scr.getSource().getRow()));
//////			}
////		}
//	}
//	
//	@Test
//	public void testScanResultByRowKeyPage() {
////		List<ScanOrderedKV> simpleCondList=new ArrayList<ScanOrderedKV>();
//////		simpleCondList.add(new ScanOrderedKV("createTime","2016-05-23 02:07:16",CompareOp.GREATER_OR_EQUAL));
//////		simpleCondList.add(new ScanOrderedKV("outorderid","out0000001",CompareOp.GREATER_OR_EQUAL));
//////		simpleCondList.add(new ScanOrderedKV("storeid","s0001",CompareOp.GREATER_OR_EQUAL));
////		simpleCondList.add(new ScanOrderedKV("auid","u000000333",CompareOp.EQUAL));
////		ArrayList<HbaseDataType> orderByList=new ArrayList<HbaseDataType>(1);
////			HbaseDataType orderBy=new HbaseDataType();
////			orderBy.setDataType(Date.class);
////			orderBy.setOrderBy(OrderBy.ASC);
////			orderBy.setQulifier("createTime");
////			orderByList.add(orderBy);
////			PagerList list=null;
////			String startRow=null;
////			CasCadeScanMap casCadeScanMap=new CasCadeScanMap();
////			List<ScanOrderedKV> olListScan=new ArrayList<ScanOrderedKV>();
////			olListScan.add(new ScanOrderedKV("sku","123",CompareOp.EQUAL));
////			casCadeScanMap.put("orderline",olListScan);//.put("orderlinedetail",null);
////			casCadeScanMap.put("ordershipment",null);
////			for(list=hbs.scanResultByRowKeyPage("omsorder", "orderdetail", null, simpleCondList,
////					casCadeScanMap, orderByList, startRow,6,false);;){
////				for(ScanResult sr:list.getListScan()){
////					String row=Bytes.toString(sr.build().getSource().getRow());
////					String createTime=sr.build().getSource().getQulifyerValueMap().get("createTime");
////					System.out.println("row:"+row+"createTime:"+createTime);
////				}
////				System.out.println();
////				startRow=list.getEndRow();
////				if(list.isEndPage())
////				{
////					startRow=list.getEndRow();
////					for(list=hbs.scanResultByRowKeyPage("omsorder", "orderdetail", null, simpleCondList,
////							casCadeScanMap, orderByList, startRow,6,true);;){
////						for(ScanResult sr:list.getListScan()){
////							String row=Bytes.toString(sr.build().getSource().getRow());
////							String createTime=sr.build().getSource().getQulifyerValueMap().get("createTime");
////							System.out.println("row:"+row+"createTime:"+createTime);
////						}
////						System.out.println();
////						startRow=list.getEndRow();
////						if(list.isEndPage())
////							return;
////						list=hbs.scanResultByRowKeyPage("omsorder", "orderdetail", null, simpleCondList,
////								casCadeScanMap, orderByList, startRow, 6,true);
////					}
////				}
////				list=hbs.scanResultByRowKeyPage("omsorder", "orderdetail", null, simpleCondList, 
////						casCadeScanMap, orderByList, startRow, 6,false);
////			}
//	}
//
//	@Test
//	public void testGroupByResultScan() {
////		String scanqulifier="cash";
////		ClassEnum classType=ClassEnum.Double;
////		int caching=100;
////		AggGroupByEnum type=AggGroupByEnum.avg;
////		String tableName="omsorder";
////		List<ScanOrderedKV> simpleScanCond=new ArrayList<ScanOrderedKV>(1);
////		String familiName="orderdetail";
////		List<String> groupBy=new ArrayList<String>(1);
////		simpleScanCond.add(new ScanOrderedKV("createTime","2016-06-16 09:27:40",CompareOp.GREATER_OR_EQUAL));
////		simpleScanCond.add(new ScanOrderedKV("createTime","2016-06-16 09:27:53",CompareOp.LESS_OR_EQUAL));
////		groupBy.add("auid");
////		AggGroupResult agp=hbs.scanGroupByResultByRowKey(tableName, familiName, scanqulifier, classType, simpleScanCond, groupBy, caching, type);
////		Object o=agp.buildValue(type, classType);
////		System.out.println();
//	}
//	
//	@Test
//	public void testAggResultScan() {
////		String scanqulifier="createTime";
////		ClassEnum classType=ClassEnum.Date;
////		int caching=100;
////		AggEnum type=AggEnum.max;
////		String tableName="omsorder";
////		List<ScanOrderedKV> simpleScanCond=new ArrayList<ScanOrderedKV>(1);
//////		simpleScanCond.add(new ScanOrderedKV("createTime","2016-06-16 09:27:40",CompareOp.GREATER_OR_EQUAL));
//////		simpleScanCond.add(new ScanOrderedKV("createTime","2016-06-16 09:27:57",CompareOp.LESS_OR_EQUAL));
////		String familiName="orderdetail";
////		AggResult agp=hbs.scanAggResultByRowKey(tableName, familiName, scanqulifier, classType, simpleScanCond, caching, type);
////		Object o=agp.buildValue(type, classType);
////		System.out.println();
//	}
//
//	@Test
//	public void testMapJoin() {
////		TbJoinPoint joinListCond=new TbJoinPoint();
////		joinListCond.setTableName("B");
////		joinListCond.setFamilyName("cfb");
////		joinListCond.getJoinPointMap().put("b11", new TbJoinPoint("A","cfa","a11"));
////		hbs.mapJoin(joinListCond);
//	}
//
//}
