package vn.com.ecopharma.hrm.tt.dto;

import java.util.Date;

import vn.com.ecopharma.hrm.tt.constant.VacationLeaveField;

import com.liferay.portal.kernel.search.Document;

public class VacationLeaveIndexedItem extends BaseEmpInfoIndexedItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;

	private String sign;

	private Date leaveFrom;

	private Date leaveTo;

	private Date actualTo;

	private String reason;

	private String description;

	private String status;

	public VacationLeaveIndexedItem(Document document) {
		super(document);
		this.type = checkNullFieldAndReturnEmptyString(VacationLeaveField.LEAVE_TYPE);
		this.type = this.type.replaceAll(" ", "_");
		this.sign = checkNullFieldAndReturnEmptyString(VacationLeaveField.SIGN);
		this.leaveFrom = checkNullFieldAndReturnNullDate(VacationLeaveField.LEAVE_FROM);
		this.leaveTo = checkNullFieldAndReturnNullDate(VacationLeaveField.LEAVE_TO);
		this.actualTo = checkNullFieldAndReturnNullDate(VacationLeaveField.ACTUAL_TO);
		this.reason = checkNullFieldAndReturnEmptyString(VacationLeaveField.REASON);
		this.description = checkNullFieldAndReturnEmptyString(VacationLeaveField.DESCRIPTION);
		this.status = checkNullFieldAndReturnEmptyString(VacationLeaveField.STATUS);
		this.status = this.status.replaceAll(" ", "_");
	}

	@Override
	protected String getIdFieldName() {
		return VacationLeaveField.ID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public Date getLeaveFrom() {
		return leaveFrom;
	}

	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public Date getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}

	public Date getActualTo() {
		return actualTo;
	}

	public void setActualTo(Date actualTo) {
		this.actualTo = actualTo;
	}

	public String getLeaveFromString() {
		return getParseDateString(leaveFrom);
	}

	public String getLeaveToString() {
		return getParseDateString(leaveTo);
	}

	public String getActualToString() {
		return getParseDateString(actualTo);
	}

	public String getLeaveFromDayMonthString() {
		return getParseDateDayMonthString(leaveFrom);
	}

	public String getLeaveToDayMonthString() {
		return getParseDateDayMonthString(leaveTo);
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFormattedString() {
		return getEmployeeCode() + " | " + getFullNameVi() + " | " + getType()
				+ " | " + getSign() + " | " + getLeaveFromDayMonthString()
				+ "-" + getLeaveToDayMonthString();
	}

}
