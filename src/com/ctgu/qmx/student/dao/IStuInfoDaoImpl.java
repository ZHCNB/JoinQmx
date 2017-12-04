package com.ctgu.qmx.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ctgu.qmx.student.dao.impl.IBaseStuInfoDao;
import com.ctgu.qmx.student.entity.StuInfo;
import com.sun.org.apache.xerces.internal.util.NamespaceContextWrapper;

public class IStuInfoDaoImpl implements IBaseStuInfoDao {

    private Connection conn;
    private PreparedStatement pstmt;

    public IStuInfoDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean doInsert(StuInfo vo) throws Exception {
        String sql = "insert into stu_info (stu_name, sex, number, phone, academy, major, classes, stu_time) values(?,?,?,?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getName());
        pstmt.setString(2, vo.getSex());
        pstmt.setString(3, vo.getNumber());
        pstmt.setString(4, vo.getPhone());
        pstmt.setString(5, vo.getAcademy());
        pstmt.setString(6, vo.getMajor());
        pstmt.setString(7, vo.getClasses());
        pstmt.setString(8, vo.getTime());
        if (pstmt.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean doDelete(String id) throws Exception {
        String sql = "delete from stu_info where number = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        if (pstmt.executeUpdate() > 0) {
            return true;
                    }
        return false;
    }

    @Override
    public boolean doUpdate(StuInfo vo) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public StuInfo findById(String num) throws Exception {
        String sql = "select * from stu_info where number = ?";
        StuInfo stuInfo = new StuInfo();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            stuInfo.setName(rs.getString("stu_name"));
            stuInfo.setSex(rs.getString("sex"));
            stuInfo.setNumber(rs.getString("number"));
            stuInfo.setPhone(rs.getString("phone"));
            stuInfo.setAcademy(rs.getString("academy"));
            stuInfo.setMajor(rs.getString("major"));
            stuInfo.setClasses(rs.getString("classes"));
            stuInfo.setTime(rs.getString("stu_time"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stuInfo;
    }

    @Override
    public List<StuInfo> findAll() throws Exception {
        String sql = "select * from stu_info";
        List<StuInfo> stuInfos = new ArrayList<StuInfo>();
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                StuInfo stuInfo = new StuInfo();
                stuInfo.setName(rs.getString("stu_name"));
                stuInfo.setSex(rs.getString("sex"));
                stuInfo.setNumber(rs.getString("number"));
                stuInfo.setPhone(rs.getString("phone"));
                stuInfo.setAcademy(rs.getString("academy"));
                stuInfo.setMajor(rs.getString("major"));
                stuInfo.setClasses(rs.getString("classes"));
                stuInfo.setTime(rs.getString("stu_time"));
                stuInfos.add(stuInfo);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return stuInfos;
    }

    @Override
    public List<StuInfo> findAllPaging(String column, String keyWord, int currentPage, int pageSize)
            throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getAllCount() throws Exception {
        String sql = "select count(*) from stu_info";
        int num = 0;
        try {
            this.pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                num = rs.getInt(1);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    @Override
    public int classCount(String classId) throws Exception {
        String sql = "select count(*) from stu_info where classes = ?";
//        String sql = "select classes, count(1) as counts from stu_info group by ?";
        int num = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, classId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                num = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

}
