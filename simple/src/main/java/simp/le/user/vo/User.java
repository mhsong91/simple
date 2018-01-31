package simp.le.user.vo;

import javax.inject.Named;

@Named
public class User {
	private int uiNO;
	private String uiName;
	private int uiAge;
	private String uiId;
	private String uiPwd;
	private int ciNo;
	public int getUiNO() {
		return uiNO;
	}
	public void setUiNO(int uiNO) {
		this.uiNO = uiNO;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public int getUiAge() {
		return uiAge;
	}
	public void setUiAge(int uiAge) {
		this.uiAge = uiAge;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public String getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(String uiPwd) {
		this.uiPwd = uiPwd;
	}
	public int getCiNo() {
		return ciNo;
	}
	public void setCiNo(int ciNo) {
		this.ciNo = ciNo;
	}
	@Override
	public String toString() {
		return "User [uiNO=" + uiNO + ", uiName=" + uiName + ", uiAge=" + uiAge + ", uiId=" + uiId + ", uiPwd=" + uiPwd
				+ ", ciNo=" + ciNo + "]";
	}
	


}
