package com.wave.schedule.dto;

public class ScheduleDto {
	private int studyNO;
	private String subject;
	private String content;
	private String studyTime;
	private String studyDate;
	private String memberCode;
	
	

	public ScheduleDto(int studyNO, String subject, String content, String studyTime, String studyDate,
			String memberCode) {
		super();
		this.studyNO = studyNO;
		this.subject = subject;
		this.content = content;
		this.studyTime = studyTime;
		this.studyDate = studyDate;
		this.memberCode = memberCode;
	}
	
	public int getStudyNO() {
		return studyNO;
	}
	public void setStudyNO(int studyNO) {
		this.studyNO = studyNO;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStudyTime() {
		return studyTime;
	}
	public void setStudyTime(String studyTime) {
		this.studyTime = studyTime;
	}
	public String getStudyDate() {
		return studyDate;
	}
	public void setStudyDate(String studyDate) {
		this.studyDate = studyDate;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	
	@Override
	public String toString() {
		return "ScheduleDto [studyNO=" + studyNO + ", subject=" + subject + ", content=" + content + ", studyTime="
				+ studyTime + ", studyDate=" + studyDate + ", memberCode=" + memberCode + "]";
	}
}
