package chapter9;

import java.time.LocalDate;

public class emp {
// 고용일
	private LocalDate hireDate;
	private int empno; // 사원번호
	private String ename; // 사원이름
	private String job; // 직책
	private int MGR; // 직속상사의 사원번호
	private Double sal; // 급여
	private double comm; // 급여외 수당
	private double Deptno; // 부서번호

	public LocalDate getHireDate() {
		return hireDate;
	}



	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		if (0 < empno || empno > 10000) {
			System.out.println("5글자 미만으로 입력하십시오.");
			this.empno = 0;
			return;
		}
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		if (ename.length() > 7) {
			System.out.println("6글자 이하으로 입력하십시오");
			this.ename = "";
			return;
		}
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		if (job.length() > 10) {
			System.out.println("9글자 이하으로 입력하십시오");
			this.job = "";
			return;
		}
		this.job = job;
	}

	public int getMGR() {
		return MGR;
	}

	public void setMGR(int MGR) {
		if (0 < MGR || MGR > 5) {
			System.out.println("5글자 미만으로 입력하십시오");
			this.MGR = 0;
			return;
		}
		MGR = MGR;
	}

	public double getSAL() {
		return sal;
	}

	public void setSAL(Double sal) {
//	sal를 문자열 자료형으로 변경
		String salToStr = sal.toString();
		// sal에 있는 소수점의 위치를를 index에 저장
		int index = salToStr.indexOf(".");
//	sal에 소수점 뒤에있는 문자열만 잘라서 저장
		salToStr = salToStr.substring(index + 1);
		if (0.00 < sal || sal > 9999999.99 || salToStr.length() > 2) {
			System.out.println("급여는 정수부 7 자리 실수부 2자까지만 입력가능합니다.");
			this.sal = 0.0;
			return;
		}
		this.sal = sal;
	}

	public double getcomm() {
		return comm;
	}

	public void setcomm(Double comm) {
//	comm를 문자열 자료형으로 변경
		String commToStr = comm.toString();
		// comm에 있는 소수점의 위치를를 index에 저장
		int index = commToStr.indexOf(".");
//	comm에 소수점 뒤에있는 문자열만 잘라서 저장
		commToStr = commToStr.substring(index + 1);
		if (0.00 < comm || comm > 9999999.99 || commToStr.length() > 2) {
			System.out.println("급여는 정수부 7 자리 실수부 2자까지만 입력가능합니다.");
			this.comm = 0.0;
			return;
		}
		this.comm = comm;
	}

	public double getDeptno() {
		return Deptno;
	}

	public void setDeptno(double deptno) {
		if (0 < deptno || deptno > 100) {
			System.out.println("3자리 미만으로 입력하시오");
			this.Deptno = 0;
			return;
		}
		Deptno = deptno;
	}
}
