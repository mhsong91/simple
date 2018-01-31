package simp.le.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class EmpDAO {
	private JdbcTemplate jt;
	
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	public void test() {
		try {
			Connection c=jt.getDataSource().getConnection();//여기서 연결이 되면 try실행 즉연결됨
			System.out.println("연결성공");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public List<Emp> selectEmpList(){
		String sql="select * from emp ";
		return jt.query(sql,new BeanPropertyRowMapper(Emp.class));//질의문을 알아서 get set해준다.
	}
	public List<Emp> selectEmpList(int empNo){
		String sql="select * from emp where empno=? ";
		
		return jt.query(sql,new Object[]{empNo},new BeanPropertyRowMapper(Emp.class));
		//Object[] {empNo}==Object[] o={empNo};==>면수명을 선언하지 않으려고
		//String[] week={월,화,수} 
		//bprm=new BeanPropertyRowMapper(Emp.class);
		//BeanPropertyRowMapper==>get,set을 알아서 해준다.
		//BeanPropertyRowMapper에(Emp.class)너어주면==>EX)while(rs.next)	rs.getString("uiNo")}를 알아서 해준다.
		/*	query==PreparedStatement ps;==> 이요건을 충족시켜야 쿼리가 실행된다 이러한 모른것을 해주는게 쿼리다
		Connection con = ps.getConnection();==>Connection c=jt.getDataSource().getConnection();
		ps.setString(1, 명훈);==>new Object[]{empNo}쿼리가 해줌
		con.prepareStatement(sql);==>sql 수행애준다
		ps.executeQuery();==>jt.query가 수행해준다
		ResultSet*///==>,new BeanPropertyRowMapper(Emp.class) get,set을 해준다
	}
	public List<Emp> insertEmpList(String empName,int empSal ){
		String sql="insert into emp(empName,empSal) values(?,?) ";
		System.out.println("추가완료"+","+empName+","+empSal);
		return jt.query(sql,new Object[]{empName,empSal},new BeanPropertyRowMapper(Emp.class));
	}
	public List<Emp> deletEmpList(int empNo){
		String sql="delete from emp where empNO=? ";
		System.out.println("삭제완료"+","+empNo);
		return jt.query(sql,new Object[]{empNo},new BeanPropertyRowMapper(Emp.class));
	}
	public List<Emp> updateEmpList(String empName,int empSal,int empNo ){
		String sql="update emp set empName=?,empSal=? where empNo=?";
		System.out.println("업데이트완료"+empName+","+empSal+","+empNo);
		return jt.query(sql,new Object[]{empName,empSal,empNo},new BeanPropertyRowMapper(Emp.class));
		
	}
	
}
