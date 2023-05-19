package test.mypac;

public class AccDto {
	// 필드의 접근 지정자를 private로
	private int accno;
	private String da;
	private int inc;
	private int outc;
	private String con;

	public AccDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param no
	 * @param da
	 * @param inc
	 * @param outc
	 * @param con
	 * @param money
	 */
	public AccDto(String da, int inc, int outc, String con) {
		this.da = da;
		this.inc = inc;
		this.outc = outc;
		this.con = con;

	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public int getInc() {
		return inc;
	}

	public void setInc(int inc) {
		this.inc = inc;
	}

	public int getOutc() {
		return outc;
	}

	public void setOutc(int outc) {
		this.outc = outc;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

}
