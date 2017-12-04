package com.ctgu.qmx.student.action;

import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.OutputStream;  
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.apache.poi.hssf.usermodel.HSSFCell;  
import org.apache.poi.hssf.usermodel.HSSFCellStyle;  
import org.apache.poi.hssf.usermodel.HSSFFont;  
import org.apache.poi.hssf.usermodel.HSSFRichTextString;  
import org.apache.poi.hssf.usermodel.HSSFRow;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.hssf.util.HSSFColor;

import com.ctgu.qmx.student.entity.StuInfo;
import com.ctgu.qmx.student.factory.ServiceFactory;  

public class DownExcel extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        response.setContentType("octets/stream");  
        String excelName = "学生信息表";  
        //转码防止乱码  
        response.addHeader("Content-Disposition", "attachment;filename="+new String( excelName.getBytes("gb2312"), "ISO8859-1" )+".xls");  
        String[] headers = new String[]{"序号","姓名","性别","学号","手机","学院","专业","组别","报名时间"};  
        try {  
            OutputStream out = response.getOutputStream();  
            exportExcel(excelName,headers, getList(), out,"yyyy-MM-dd");  
            out.close();  
            System.out.println("excel导出成功！");  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        doGet(request, response);  
    }  
    /** 
     *  
     * @Description:从数据库中取出数据，并存储到Map中 
     * @Auther: ZHC
     * 
     * 
     */  
    public List<Map<String,Object>> getList(){
        List<StuInfo> lists = new ArrayList<StuInfo>();
        //        lists = ServiceFactory.createStuInfoServiceInstance().findAll();
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();  
        StuInfo info = new StuInfo();
        try {
            lists = ServiceFactory.createStuInfoServiceInstance().findAll();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i = 0; i < lists.size();i++){  
            Map<String,Object> map = new HashMap<String, Object>();  
            info = lists.get(i);
            map.put("Id",1+i);  
            map.put("Name", info.getName());  
            map.put("Sex", info.getSex());
            map.put("Num", info.getNumber());
            map.put("Tel", info.getPhone());
            map.put("Ady", info.getAcademy());
            map.put("Mjr", info.getMajor());
            map.put("Cla", info.getClasses());
            map.put("Tim", info.getTime());
            list.add(map);  
        }  
        return list;  
    }  
    /** 
     *  
     * @Description: 生成excel并导出到客户端（本地） 
     * @Auther: ZHC 
     * 
     */  
    protected void exportExcel(String title,String[] headers,List mapList,OutputStream out,String pattern){  
        //声明一个工作簿  
        HSSFWorkbook workbook = new HSSFWorkbook();  
        //生成一个表格  
        HSSFSheet sheet = workbook.createSheet(title);  
        //设置表格默认列宽度为15个字符  
        sheet.setDefaultColumnWidth(20);  
        //生成一个样式，用来设置标题样式  
        HSSFCellStyle style = workbook.createCellStyle();  
        //设置这些样式  
        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);  
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        //生成一个字体  
        HSSFFont font = workbook.createFont();  
        font.setColor(HSSFColor.VIOLET.index);  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  
        //把字体应用到当前的样式  
        style.setFont(font);  
        // 生成并设置另一个样式,用于设置内容样式  
        HSSFCellStyle style2 = workbook.createCellStyle();  
        style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);  
        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
        // 生成另一个字体  
        HSSFFont font2 = workbook.createFont();  
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);  
        // 把字体应用到当前的样式  
        style2.setFont(font2);  
        //产生表格标题行  
        HSSFRow row = sheet.createRow(0);  
        for(int i = 0; i<headers.length;i++){  
            HSSFCell cell = row.createCell(i);  
            cell.setCellStyle(style);  
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);  
            cell.setCellValue(text);  
        }  
        for (int i=0;i<mapList.size();i++) {  
            Map<String,Object> map = (Map<String, Object>) mapList.get(i);  
            row = sheet.createRow(i+1);  
            int j = 0;  
            Object value = null;  
            value=map.get("Id");  
            if(value instanceof Integer){  
                row.createCell(j++).setCellValue(String.valueOf(value));  
            }  
            row.createCell(j++).setCellValue(map.get("Name").toString());  
            row.createCell(j++).setCellValue(map.get("Sex").toString());
            row.createCell(j++).setCellValue(map.get("Num").toString());
            row.createCell(j++).setCellValue(map.get("Tel").toString());
            row.createCell(j++).setCellValue(map.get("Ady").toString());
            row.createCell(j++).setCellValue(map.get("Mjr").toString());
            row.createCell(j++).setCellValue(map.get("Cla").toString());
            row.createCell(j++).setCellValue(map.get("Tim").toString());
        }  
        try {  
            workbook.write(out);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

}  