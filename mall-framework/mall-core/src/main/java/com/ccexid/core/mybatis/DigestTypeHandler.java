package com.ccexid.core.mybatis;

import com.ccexid.core.utils.DigestUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes({JdbcType.VARCHAR, JdbcType.VARBINARY})
public class DigestTypeHandler<T> extends BaseTypeHandler<T> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        // 实现密码加密逻辑，这里假设使用简单的MD5加密
        String encryptedPassword = DigestUtils.digest(String.valueOf(parameter));
        ps.setString(i, encryptedPassword);
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 从数据库获取加密后的密码
        String encryptedPassword = rs.getString(columnName);
        return (T) encryptedPassword;
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 从数据库获取加密后的密码
        String encryptedPassword = rs.getString(columnIndex);
        return (T) encryptedPassword;
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 从存储过程获取加密后的密码
        String encryptedPassword = cs.getString(columnIndex);
        return (T) encryptedPassword;
    }
}
